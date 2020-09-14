(def __

  (fn f [s]
    (let [leaf (not (coll? (first s)))]
      (if leaf
        [s]
        (apply concat (map f s)))))

  )

(prn (__ [["Do"] ["Nothing"]])
     [["Do"] ["Nothing"]])

(prn (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
     [[:a :b] [:c :d] [:e :f]])
