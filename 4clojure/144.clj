(def __

  (fn [initval & fns]
    (loop [loopfuns (flatten (repeat fns))
           result []
           val initval]
      (let [newval ((first loopfuns) val)]
        (lazy-seq
         (recur (rest loopfuns)
                (conj result newval)
                newval)
         )
        )
      )
    )

  )

(prn (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
