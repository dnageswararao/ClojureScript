"14. Destructuring"

(= ":bar:foo"  ((fn [[a b]] (str b a)) [:foo :bar]))

((fn [[a b c]] (str "An oxford comma list of " a " ," b " ," c " .")) ["apples" "oranges" "peers"])

(= "An oxford comma list of apples ,oranges ,peers2 ." ((fn [[a b c]] (str "An oxford comma list of " a " ," b " ," c " .")) ["apples" "oranges" "peers2"]))

(= "clojure  the strong aka1 programming language aka1 than any other" (let [[first-name last-name & aliases] (list "clojure " "the strong" "programming language" "than any other")] (str first-name " " last-name  (apply str (map #(str " aka1 " %) aliases)))))

(= {:fullname ["ASten" "Holding"], :firstname "ASten", :lastname "Holding"} (let [[first-name last-name :as full-name] ["ASten" "Holding"]] {:fullname full-name :firstname first-name :lastname last-name}))

(def address { :str-add "ABCDEF" :city "HYDERABAD" :state "DEF"})

(= "ABCDEF ,HYDERABAD ,DEF" (let [{Street-Address :str-add City :city State :state} address] (str Street-Address " ," City  " ," State)))

(= "ABCDEF ,HYDERABAD ,DEF" (let [{:keys [str-add city state]} address] (str str-add " ," city " ," state)))

(= "Bob ,Woolmer ,ABCDEF ,HYDERABAD ,DEF ." ((fn [[first-name last-name] {:keys [str-add city state]}] (str first-name " ," last-name " ," str-add " ," city " ," state " .")) ["Bob" "Woolmer"] address))
