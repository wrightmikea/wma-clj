(ns leiningen.new.wma-clj
  (:require [wma-clj.gen.lib :as lib]))

(defn clj-cli
  "generates a Clojure CLI project"
  [name]
  (prn "tbd cli" name))

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
     "lib" (lib/clj-lib name)
     "node-cli" (cljs-cli name)
     "node-lib" (cljs-lib name)
     (prn "unrecognized type" type))))
