"13. Recursion"

(defn is-even [n] (if (= n 0) true (not (is-even (dec n)))))


(defn is-even-big? [n] (loop [n n acc true] (if (= n 0) acc (recur (dec n) (not acc)))))

(defn factorial[n] (loop [n n acc 1] (if (= 0 n) acc  (recur (dec n) (* n acc)))))

(= true (is-even 0))

(= 1 (factorial 1))

(= 24 (factorial 4))

(= false (is-even-big? 100003N))

(< 1000000000000000000000000N (factorial 1000N))
