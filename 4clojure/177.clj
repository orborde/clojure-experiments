(def f (fn [s] false))

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
