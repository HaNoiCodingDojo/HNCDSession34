 (ns Roman-Numbers.core-test
  (:use clojure.test
        Roman-Numbers.core))

(defn arabic->roman
  "Convert arabic numbers to roman ones"
  [number]
  (if (= 1 number)
    "I"))

(deftest test-1-becomes-I
  (is (= "I" (arabic->roman 1))))
