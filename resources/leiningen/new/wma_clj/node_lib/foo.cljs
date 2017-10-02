(ns {{name}}.{{name}}
  (:require-macros [wma-cljs-macs.wma-cljs-macs :refer [requirejs]])
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(requirejs fs)

(defn {{name}} []
  (str "{{name}}.{{name}}/{{name}}"))

