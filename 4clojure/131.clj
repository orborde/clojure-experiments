(def __

  (fn [& sets]
    (let [
          powerset
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

          powersets
          (for [s sets]
            (filter #(not (empty? %)) (powerset s)))

          subsums
          (for [pss powersets]
            (set
             (for [ps pss]
               (apply + ps))))
          ]

      (not (empty? (apply clojure.set/intersection subsums)))
      )
    )

  )

(prn  (__ #{-1 1 99}
          #{-2 2 888}
          #{-3 3 7777}))

(prn (__ #{1}
         #{2}
         #{3}
         #{4}))
