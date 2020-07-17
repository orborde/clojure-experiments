(def __

  (fn [size coll]
    (loop [result []
           remaining coll]
      (if
        (>= (count remaining) size)
        (recur
         (conj result (take size remaining))
         (drop size remaining))
        result)))

  )
