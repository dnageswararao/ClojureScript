"6 .Functions"

(defn multiply [n] (* 10 n))

(defn square [n] (* n n))

(= 10 ((fn [n] (* 5 n)) 2))

(= 60 (#(* 15 %) 4))

(= 15 (#(+ %1 %2 %3) 4 5 6))

(= 30 (#(* 15 %2) 1 2))

(= 9 ((fn [a b] (+ a b)) 4 5))

(= 20 ((fn [f] (f 4 5)) *))

(= 25 ((fn [n] (n 5)) (fn [n] (* n n))))

(= 25 ((fn [f] (f 5)) square))
