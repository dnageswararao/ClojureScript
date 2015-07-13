"12. Creating_Functions"

(= [true false true true] (let [not-symbol (complement symbol?)] (map not-symbol [:a 'b "c" 1])))

(= '(:name name "name") (let [not-nil (complement nil?)] (filter not-nil [nil :name nil 'name nil "name"])))

(= 20 (let [multiply-5 (partial * 5)] (multiply-5 4)))

(= '(:a :b :c :d) (let [ab-concat (partial concat [:a :b])] (ab-concat [:c :d])))

(defn square [c] (* c c))

(= 9 (let [inc-square (comp inc dec)] (inc-square 4)))

(= 38 (let [decrement-double (comp dec dec)] (decrement-double 40)))

(= 99 (let [square-dec (comp dec square)] (square-dec 10)))
