(def __
  (fn [s]
    (let [pieces (clojure.string/split s #"[., !]+")]
      (sort (fn [x y] (compare (clojure.string/lower-case x) (clojure.string/lower-case y))) pieces)
      )
    )
  
  )

(prn (__ "Have a nice day."))
