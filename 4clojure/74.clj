(def __

  (fn [s]
    (let [nums (map #(Integer/parseInt %) (clojure.string/split s #","))]
      (clojure.string/join
       \,
       (map
        str
        (filter
         (fn [n]
           (not (empty? (filter (fn [y] (= (* y y) n)) (range n)))))
         nums)
        )
       )
      )
    )

  )

(prn (__ "4,5,6,7,8,9"))
