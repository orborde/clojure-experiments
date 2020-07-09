(println(

(fn [words]
   (let
       [mergeword
        (fn [word dict]
          (let [anakey (clojure.string/join (sort word))]
            (assoc
             dict
             anakey
             (conj (get dict anakey #{}) word))))

        thendo
        (fn [words dict thunk]
          (if (empty? words)
            dict
            (fn [] (thunk (rest words) (mergeword (first words) dict) thunk))))
        ]

     (set (vals (trampoline thendo words {} thendo)))))

 ["meat" "mat" "team" "mate" "eat"])

)
