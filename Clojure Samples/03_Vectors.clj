"3. Vectors"

(= 1 (count [42]))

(= [1] (vec '(1)))

(= [nil nil ](vector nil nil ))

( = [1 2] (vec '(1 2)))

(= [111 222 333] (conj [111 222] 333))

(= :peanut (first [:peanut :butter]))

(= :butter (last [:peanut :butter]))

(= :and (nth [:peanut :butter :and] 2))

(= [:butter :and] (subvec [:peanut :butter :and :jelly]1 3 ))

(= '(1 2 3) (vector 1 2 3))
