(def __

  (fn [numbers]
    (loop [result #{}
           next 2]
      (cond
        (>= (count result) numbers)
        (sort result)

        (empty? (filter (fn [x] (= (mod next x) 0)) result))
        (recur (conj result next) (inc next))

        :else
        (recur result (inc next))
        )
      )
    )
  )

(prn (__ 10))
