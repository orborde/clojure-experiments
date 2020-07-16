(def f

  (fn [orig]
    (let [
          brackets
          {\{ \},
           \[ \],
           \( \)}

          isstart (fn [c] (not (nil? (brackets c))))
          isend (fn [c] (not (nil? ((set (vals brackets)) c))))
          ]
      (loop
          [s orig
           stack ()]
                                        ;(println "running" s stack)
        (let [c (first s)]
          (cond
            (empty? s)
            (do
                                        ;(prn "end")
              (empty? stack))

            (isstart c)
            (do
                                        ;(println "start" c)
              (recur
               (rest s)
               (conj stack c)))

            (isend c)
            (do
                                        ;(println "end" c)
              (let [expected (brackets (first stack))]
                (if (= expected c)
                  (recur (rest s) (rest stack))
                  false))
              )

            :else
            (do
                                        ;(prn "charprc" c)
              (recur (rest s) stack)
              )
            )))))

  )

(def cases `(
             (f "This string has no brackets.")
             (f "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }")
             (not (f "(start, end]"))
             (not (f "())"))
             (not (f "[ { ] } "))
             (f "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
             (not (f "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
             (not (f "["))))

(doall (for [c cases]
         (println (eval c) c)))
