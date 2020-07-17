(def __

  (fn [coll]
    (loop [remaining coll
           seen #{}
           result []]
      (cond
        (empty? remaining)
        result

        (seen (first remaining))
        (recur (rest remaining) seen result)

        :else
        (recur
         (rest remaining)
         (conj seen (first remaining))
         (conj result (first remaining)))
        )
      )
    )

  )

(prn (__ [1 2 1 3 1 2 4]))
