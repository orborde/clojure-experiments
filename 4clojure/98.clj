(def __

  (fn [f D]
    (set (for [a D]
      (into
       #{a}
       (filter
        (fn [b] (= (f a) (f b)))
        D)
       )
      )
    ))

  )


(prn (__ #(* % %) #{-2 -1 0 1 2}))
