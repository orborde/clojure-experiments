(def __
  (fn decurry [f]
    (fn [& initargs]
      (loop [args initargs
             nf f]

        (if (empty? args)
          nf
          (recur (rest args) (nf (first args))))
        )
      )
    )
  )

(prn ((__ (fn [a]
            (fn [b]
              (fn [c]
                (fn [d]
                  (+ a b c d))))))
      1 2 3 4))
