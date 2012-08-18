 (ns Roman-Numbers.core-test
  (:use clojure.test
        Roman-Numbers.core))

(defn arabic->roman
  "Convert arabic numbers to roman ones"
  [number]
  (cond (= 1 number)   "I"
        (= 2 number)   "II"
        (= 3 number)   "III"))

(deftest test-1-becomes-I
  (is (= "I" (arabic->roman 1))))

(deftest test-2-becomes-II
  (is (= "II" (arabic->roman 2))))

(deftest test-3-becomes-III
  (is (= "III" (arabic->roman 3))))

(deftest test-4-becomes-IV
  (is (= "IV" (arabic->roman 4))))
