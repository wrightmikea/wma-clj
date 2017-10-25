(ns {{name}}.manual-test
  (:require [{{name}}.lib :as lib]))

(defn test []
  (println "src/{{name}}/manual-test.cljs")
  (set! (.-innerHTML (.getElementById js/document "app")) (lib/foo)))

(comment
  (test)
  )
