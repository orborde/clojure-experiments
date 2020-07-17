(def __

  (fn [& fns]
    (fn [& coll]
      (map (fn [f] (apply f coll)) fns)
      )
    )

  )

(prn ((__ + max min) 2 3 5 1 6 4))
