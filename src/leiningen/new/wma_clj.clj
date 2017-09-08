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
  (prn "tbd lib" name)
  (let [data {:name name
                 :sanitized (name-to-path name)}]
       (main/info "Generating fresh 'lein new' wma-clj 'library' project.")
       (->files data
                ["project.clj" (render "lib/project.clj" data)]
                ["src/{{sanitized}}/{{sanitized}}.clj"
                 (render "lib/foo.clj" data)]
                ["test/{{sanitized}}/{{sanitized}}_test.clj"
                 (render "lib/foo_test.clj" data)])))

(defn cljs-app
  "generates a ClojureScript browser application"
  [name]
  (prn "tbd app" name))

(defn cljs-cli
  "generates a ClojureScript CLI project"
  [name]
  (prn "tbd node-cli" name))

(defn cljs-lib
  "generates a ClojureScript Libraru project"
  [name]
  (prn "tbd node-lib" name))

(defn wma-clj
  "generates a leiningen project"
  ([name]
   (wma-clj name "lib"))
  ([name type & opts]
   (when opts (prn opts))
   (condp = type
     "app" (cljs-app name)
     "cli" (clj-cli name)
     "lib" (clj-lib name)
     "node-cli" (cljs-cli name)
     "node-lib" (cljs-lib name)
     (prn "unrecognized type" type))))
