(ns ^:figwheel-always {{name}}.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn test-me []
  "{{name}}.core/test-me")

(println (test-me))

(set! (.-exports js/module) #js {:hello #(println "{{name}} :hello")})
;;
(def -main (fn [] nil))
(set! *main-cli-fn* -main) ;; this is required
