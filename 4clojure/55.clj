(def __

  (fn [coll]
    (into
     {}
     (vec
      (map
       (fn [kv] (vec (list (first kv) (count (second kv)))))
       (group-by identity coll)
       )
      )

     )
    )

  )

(prn (__ [1 1 2 3 2 1 1]))
