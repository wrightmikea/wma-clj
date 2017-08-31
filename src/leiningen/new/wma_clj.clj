(ns leiningen.new.wma-clj
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "wma-clj"))

(defn wma-clj
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' wma-clj project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
