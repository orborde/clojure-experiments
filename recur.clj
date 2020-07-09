(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (inc x))))

 (loop [x 0]
  (when (< x 10)
    (println x)
    (loop [x 1]
      (when (< x 10)
        (println x)
        (recur (inc x))))
    ))

 (loop [x 0]
  (when (< x 10)
    (println x)
    (loop [x 1]
      (when (< x 10)
        (println x)
        (loop [x 2]
          (when (< x 10)
            (println x)
            (recur (inc x))))
        ))))
