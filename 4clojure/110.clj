(def __

  (fn f [start]
    (let [pronounce
          (fn [digits]
            (loop [remaining digits
                   result []]
              (if
                  (empty? remaining)
                result
                (let [d (first remaining)
                      pred (fn [x] (= x d))
                      c (count (take-while pred remaining))
                      rest (drop-while pred remaining)]
                  (recur rest (conj result c d))))))]

      (lazy-seq (cons (pronounce start) (f (pronounce start))))
      )
    )

  )

(prn (take 3 (__ [1])))
