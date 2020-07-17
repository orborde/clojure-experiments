(println

 (
  (
   (fn [& funcs]
     (let [appq (reverse funcs)]
       (fn [& initargs]
         (loop [data (apply (first appq) initargs)
                remain (rest appq)]
           (let [nxt (first remain)
                 v (apply nxt [data])]
             (println "nxt:" data nxt remain v)
             (if (empty? (rest remain))
               v
               (recur v (rest remain))
               )
             )
           )
         )
       )
     )

   rest reverse) [1 2 3 4]))
