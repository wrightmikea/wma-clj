(ns {{name}}.filter
    (:import (org.park.IParkFilter))
    (:gen-class))

(gen-class
 :name com.example.{{name}}.Filter
 :implements [org.park.IParkFilter])

(defn -capabilities [_]
  {})

(defn -exec [_ options]
  {})

(defn -wire [_ options]
  {})
