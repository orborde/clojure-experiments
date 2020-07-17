(println "I am actually doing something")
(flush)
(println (let [base (vec (range 100000000))]
           (list
            (first (conj base -1))
            (first (conj base -2))
            )
           ))
