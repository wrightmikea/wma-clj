(ns {{name}}.lib-test
  (:require [{{name}}.lib :as subject]
            [cljs.test :refer [deftest is testing]]))

(deftest lib-test
  (testing "main"
    (let [actual (with-out-str
                   (subject/-main))]
      (is (= "{{name}}.lib/-main\n" actual)))))
