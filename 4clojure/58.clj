(println

 (
  ((fn [& funcs]
     (let [appq (reverse funcs)]
       (fn [& initargs]
         (loop [args initargs
                nxt (first appq)
                remain (rest appq)]
           (let [v (apply nxt [args])]
             (println args nxt remain v)
             (if (empty? remain)
               v
               (recur v (first remain) (rest remain))
               )
             )
           )
         )
       )
     )

   rest reverse) [1 2 3 4]))
