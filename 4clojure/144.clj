(def __

  (fn x [initval & fns]
    (lazy-seq (cons
               initval
               (apply x
                      (concat [((first fns) initval)] (rest fns) [(first fns)])
                      )
               )
              )
    )
  )

(prn (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
