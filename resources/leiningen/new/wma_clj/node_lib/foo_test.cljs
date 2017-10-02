(ns {{name}}.{{name}}-test
  (:require [{{name}}.{{name}} :as subject]
            [cljs.test :refer [deftest is testing]]))

(deftest {{name}}-test
  (testing "{{name}}"
    (let [actual (subject/{{name}})]
      (is (= "{{name}}.{{name}}/{{name}}" actual)))))
