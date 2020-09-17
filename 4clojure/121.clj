(def __

  (fn [formula]
    (fn [varmap]
      ((fn ev [varmap expr]
         (cond
           (seq? expr)
           (let [evalargs (for [subexpr (rest expr)] (ev varmap subexpr))]
             (case (first expr)
               + (apply + evalargs)
               - (apply - evalargs)
               * (apply * evalargs)
               / (apply / evalargs))
             )

           (symbol? expr)
           (varmap expr)

           (number? expr)
           expr

           :else
           (throw (ex-info "Could not make sense of expr" {:expr expr}))
           )
         )

       varmap formula)
      )
    )
  )
