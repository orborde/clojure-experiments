(def __

  (fn [n]
    (let [divisors (filter #(= (mod n %) 0) (range 1 n))]
      (= (apply + divisors) n)))

  )
