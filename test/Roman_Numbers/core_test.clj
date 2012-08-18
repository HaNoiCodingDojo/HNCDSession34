 (ns Roman-Numbers.core-test
  (:use clojure.test
        Roman-Numbers.core))

(defn arabic->roman
  "Convert arabic numbers to roman ones"
  [number]
  (cond (= 1 number)   "I"
        (= 2 number)   "II"
        (= 3 number)   "III"
        (= 4 number)   "IV"
        (= 5 number)   "V"
        (= 6 number)   "VI"))

(deftest test-1-becomes-I
  (is (= "I" (arabic->roman 1))))

(deftest test-2-becomes-II
  (is (= "II" (arabic->roman 2))))

(deftest test-3-becomes-III
  (is (= "III" (arabic->roman 3))))

(deftest test-4-becomes-IV
  (is (= "IV" (arabic->roman 4))))

(deftest test-5-becomes-V
  (is (= "V" (arabic->roman 5))))

(deftest test-6-becomes-VI
  (is (= "VI" (arabic->roman 6))))

(deftest test-7-becomes-VII
  (is (= "VII" (arabic->roman 7))))
