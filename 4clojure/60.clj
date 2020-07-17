(def __

  (fn myred
    ([r data remaining]
     (cond
       (empty? remaining)
       (list data)

       :else
       (let [newdata (r data (first remaining))]
         (lazy-seq
          (cons
           data
           (myred r newdata (rest remaining))
           )
          )
         )
       ))

    ([r remaining] (myred r (first remaining) (rest remaining)))
    )

  )


(def cases
  '(
    ((take 5 (__ + (range))) [0 1 3 6 10])
    ((__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
    ((last (__ * 2 [3 4 5])) 120)
    )
  )

(dorun
 (for [cs cases]
   (let [[expr expected] cs
         actual (eval expr)
         status (if (= actual expected) "pass" "FAIL")]
     (prn status expr "expected:" expected, "actual" actual))))
