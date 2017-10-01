(ns {{name}}.core-test
    (:require [{{name}}.core :as subject]
              [clojure.test :refer :all]))

(deftest core-test
  (testing "core-test"
    (let [actual (with-out-str (subject/-main))]
      (is (= "application main...\n" actual)))))
