(def __

(fn [coll numgroups]
	(let [chunks
          (loop [result []
                 remaining coll]
            (if (empty? remaining)
              result
              (recur (conj result (take numgroups remaining))
                     (drop numgroups remaining))))]
      (apply interleave chunks)))

  )

(def cases
  `(
    (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
    (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
    (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
    )
  )

(doall (for [c cases]
         (println (eval c) c)))


(prn (__ [1 2 3 4 5 6] 2))
