"9. Runtime_polymorphism"

(defn hello ([] "Hello world..!!")  ([x] ( str "Hello ,Clojure " x " ..!")) ([x & more] (str "Helllo to this clojure group: " (apply str (interpose ", " (cons x more))) "..!!")))

(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] (str (:name a) " eats veggies..!"))
(defmethod diet :carnivore [a] (str (:name a) " eats animals..!!!"))
(defmethod diet :default [a] (str "I dont know what " (:name a) " eats..!!!!"))
