"7.Conditionals"

(= :a (if (false? (= 4 5)) :a :b))

(= [] (if (> 4 3) []))

(= nil (if (nil? 0) [:a :b :c]))

(= :glory (if (not (empty? ())) :doom :glory))

(let [x 5] (= :your-road (cond (= x 1) :road-not-taken
                               (= x 2) :another-road-not-taken
                               :else :your-road)))

(= 'doom (if-not (zero? 1) 'doom 'more-doom))

(defn explain-exercise-velocity [exercise-term]
  (case exercise-term
    :bicycling        "pretty fast"
    :jogging          "not super fast"
    :walking          "not fast at all"
    "is that even exercise?"))

(= "pretty fast" (explain-exercise-velocity :bicycling))

(= "is that even exercise?" (explain-exercise-velocity :watching-tv))
