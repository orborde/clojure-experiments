(def __

  (fn
    ([a b] "hello")
    ([a b c] "beans")
    )

  )


(def cases
  '(
    ((take 5 (__ + (range))) [0 1 3 6 10])
    ((__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
    ((last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
    )
  )

(dorun
 (for [cs cases]
   (let [[expr expected] cs
         actual (eval expr)
         status (if (= actual expected) "pass" "FAIL")]
     (prn status expr actual))))
