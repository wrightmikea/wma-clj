(ns {{name}}.app-test
  (:require [{{name}}.app :as subject]
            [cljs.test :refer [deftest is testing]]))

(deftest app-test
  (testing "main"
    (let [actual (with-out-str
                   (subject/main))]
      (is (= "{{name}}.app/main\nreloaded\n" actual)))))
