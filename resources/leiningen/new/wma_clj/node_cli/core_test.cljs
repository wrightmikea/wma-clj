(ns {{name}}.core-test
  (:require [{{name}}.core :as subject]
            [cljs.test :refer [deftest is testing]]))

(deftest core-test
  (testing "test-me"
    (let [actual (subject/test-me)]
      (is (= "{{name}}.core/test-me" actual)))))
