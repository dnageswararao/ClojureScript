"10. Lazy_sequences"

(= '(1 2 3 4) (range 1 5))

(= '(0 1 2 3 4) (range 5))

(take 4 (range 5))

(= '(0 1 2 3 4 5 6 7 8 9) (take 10 (range 100)))

(drop 96(range 100))

(= '(96 97 98 99) (drop 96 (range 100)))

(= '(0 1 2 3 4 5) (take 6 (iterate inc 0)))

(= '(:a :a :a) (repeat 3 :a))

(= (repeat 5 :hello)(take 5 (iterate (fn [n] n) :hello)))
