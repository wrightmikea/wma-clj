(ns {{name}}.core
  (:require-macros [wma-cljs-macs.wma-cljs-macs :refer [requirejs]])
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(requirejs fs)

(defn -main []
  (println "{{name}}.core"))

(set! *main-cli-fn* -main)
