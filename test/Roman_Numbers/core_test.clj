 (ns Roman-Numbers.core-test
  (:use clojure.test
        Roman-Numbers.core))

(deftest a-test
  (testing "1 becomes I"
    (is (= "I" (arabic->roman 1)))))