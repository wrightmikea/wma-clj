(ns leiningen.new.wma-clj
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "wma-clj"))

(defn clj-cli
  "generates a Clojure CLI project"
  [name]
  (prn "tbd cli" name))

(defn clj-lib
  "generates a Clojure library project"
  [name]
     (let [data {:name name
                 :sanitized (name-to-path name)}]
       (main/info "Generating fresh 'lein new' wma-clj 'library' project.")
       (->files data
                ["project.clj" (render "project.clj" data)]
                ["src/{{sanitized}}/{{sanitized}}.clj" (render "foo.clj" data)]
                ["test/{{sanitized}}/{{sanitized}}_test.clj"
                 (render "foo_test.clj" data)])))

(defn wma-clj
  "generates a leiningen project"
  ([name]
   (wma-clj name "lib"))
  ([name type]
   (condp = type
     "cli" (clj-cli name)
     "lib" (clj-lib name)
     :else (prn "unrecognized type" type))))
