"Two 3*3 Matrices Multiplication"

(def m_a [[3 6 9] [1 4 7] [2 5 8]])

(def m_b [[1 2 3] [4 5 6] [7 8 9]])


(defn twomatr_func [f x y] (map (fn [z] (map (fn [w] (f z w)) y)) x))

(defn tr [s] (apply map vector s))

(defn order [x y] (reduce + (map * y x)))

(twomatr_func order m_a (tr m_b))
