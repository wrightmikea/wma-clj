(ns {{name}}.core-test
  (:require [{{name}}.core :as subject]
            [cljs.test :refer [deftest is testing]]))

(deftest core-test
  (testing "main"
    (let [actual (with-out-str
                   (subject/-main))]
      (is (= "{{name}}.core\n" actual)))))
