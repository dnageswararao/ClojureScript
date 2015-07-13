"5. Maps"

(= {:a 1 :b 2} (hash-map :a 1 :b 2))

(= {:a 1} (hash-map :a 1))

(= 2 (count {:a 1 :b 2}))

(= 2 (get {:a 1 :b 2} :b))

(= 1 ({:a 1 :b 2} :a))

(= 1 (:a {:a 1 :b 4}))

(= "Sochi" ({2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"} 2014))

(= nil (get {:a 1 :b 2} :c))

(= :key-not-found (get {:a 1 :b 2} :c :key-not-found))

(= true (contains? {:a nil :b nil} :b))

(= false (contains? {:a nil :b nil} :c))

(= {1 "January" 2 "February"} (assoc {1 "January"} 2 "February"))

(= {1 "January"} (dissoc {1 "January" 2 "February"} 2))

(= (list 2010 2014 2018) (sort (keys { 2014 "Sochi" 2018 "PyeongChang" 2010 "Vancouver"})))

(= (list "PyeongChang" "Sochi" "Vancouver") (sort (vals {2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"})))
