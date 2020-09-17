(def __

  (fn powerset [s]
    (if (empty? s)
      #{#{}}
      (apply
       clojure.set/union
       (for [sub (powerset (rest s))]
         #{sub (conj sub (first s))})
       )
      )
    )

  )

(prn (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})
