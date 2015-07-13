"11. Sequence_comprehensions"

(= '(0 1 2 3 4 5) (for [x (range 6)] x))

(= '(0 1 4 9 16 25) (map (fn [x] (* x x)) (range 6))  (for [x (range 6)] (* x x)) )

(= '(1 3 5 7) (filter odd? (range 9)) (for [x (range 9) :when (odd? x)] x))

(= '(1 3 5 7) (filter even? (range 9)) (for [x (range 9) :when (even? x)] x))

(= [[:top :left] [:top :middle] [:top :right] [:centre :left] [:centre :middle] [:centre :right] [:bottom :left] [:bottom :middle] [:bottom :right]]  (for [row [:top :centre :bottom] column [:left :middle :right]] [row column]))
