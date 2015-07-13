"2. Lists"

(= '(1 2 3 4) (list 1 2 3 4))

(= 1 (first '(1 2 3 4)))

(= 4 (last '(1 2 3 4)))

(= '(2 3 4) (rest '(1 2 3 4)))

(= 4 ( count '(1 2 3 4)))

(= 0 (count '()))

(= '() (rest '(100)))

(= '(:a :b :c :d) (cons :a '(:b :c :d)))

(= '(:a :b :c :d) (conj '(:b :c :d) :a))

(= :a (peek '(:a :b :c :d)))

(= '(:b :c :d) (pop '(:a :b :c :d)))

(= "No dice!"( try ( pop '()) (catch IllegalStateException e "No dice!")))

(= '() ( try ( rest '()) (catch IllegalStateException e "No dice!")))
