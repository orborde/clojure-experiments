(defn take [n coll]
      (lazy-seq
        (when (pos? n)
              (when-let [s (seq coll)]
                        (cons (first s) (take (dec n) (rest s)))))))
