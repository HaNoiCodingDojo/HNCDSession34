 (ns Roman-Numbers.core-test
  (:use clojure.test
        Roman-Numbers.core))

(defn arabic->roman
  "Convert arabic numbers to roman ones"
  [number]
  (let [arabic->roman-pairs
        [[0 ""]
         [1 "I"]
         [4 "IV"]
         [5 "V"]
         [9 "IX"]
         [10 "X"]
         ]
        temp (filter (fn [pair]
                       (<= (first pair) number))
                     (reverse arabic->roman-pairs))
        first-element (first temp)
        arabic (first first-element)]
    (if (= number arabic)
      (last first-element)
      (str (last first-element) (arabic->roman (- number (first first-element)))))
        
    ))

(deftest test-13-becomes-XIII
  (is (= "XIII" (arabic->roman 13))))

(deftest test-12-becomes-XII
  (is (= "XII" (arabic->roman 12))))

(deftest test-11-becomes-XI
  (is (= "XI" (arabic->roman 11))))

(deftest test-10-becomes-X
  (is (= "X" (arabic->roman 10))))

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

(deftest test-8-becomes-VIII
  (is (= "VIII" (arabic->roman 8))))

(deftest test-9-becomes-IX
  (is (= "IX" (arabic->roman 9))))
