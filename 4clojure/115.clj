(def __

  (fn [n]
    (let [ns (str n)
          digits (for [c ns] (Integer/parseInt (str c)))
          midPoint (int (Math/floor (/ (count digits) 2)))
          left (take midPoint digits)
          right (take-last midPoint digits)]
      (= (apply + left) (apply + right))
      )
    )

  )

(prn (__ 11))
