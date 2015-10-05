"Max Function"

(defn max1 [x y] (if (> x y) x y))

(defn max3 [x y z] (max1 (max1 x y) z))

"Factorial function"

(defn factorial [n]
  (if (= n 1) 1
      (* n (factorial (dec n)))))

"is-prime function"

(defn prime? [n]
  (not-any? zero? (map #(rem n %) (range 2 n))))


"is-perfect function"

(defn perfect-num? [n]
  (= n (reduce + (filter #(= 0 (rem n %)) (range 1 n)))))


"Word frequency"

(defn word-freq [text]
  (reduce #(assoc %1 %2 (inc (%1 %2 0)))
          {} (re-seq #"\w+" text))) (word-freq "Hello to the clojure better than to, C...")

"Index function"

(defn index_func [coll ele]
  "Return a index of the given element in a list"
  (loop [c coll acc 0]
    (if (empty? c) -1
        (if (= ele (first c)) acc
            (recur (rest c) (inc acc)))))) (index_func [1 2 3 4 5 6 7] 5)
