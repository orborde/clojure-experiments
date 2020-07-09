(fn [f & args]
  (loop [result (apply f args)]
    (if (fn? result)
      (recur (result))
      result)))
    
