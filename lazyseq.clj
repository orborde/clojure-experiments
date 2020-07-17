(defn positive-numbers
  ([] (positive-numbers 1))
  ([n] (prn "eval" n) (lazy-seq (cons n (positive-numbers (inc n))))))

(prn "take 1")
(prn (take 1 (positive-numbers)))

(prn "take 5")
(prn (take 5 (positive-numbers)))
