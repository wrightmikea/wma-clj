(ns leiningen.new.wma-clj
  (:require [wma-clj.gen.app :as app]
            [wma-clj.gen.cli :as cli]
            [wma-clj.gen.lib :as lib]))

(defn cljs-web
  "generates a ClojureScript web browser application"
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
     "app" (app/clj-app name)
     "cli" (cli/clj-cli name)
     "lib" (lib/clj-lib name)
     "node-cli" (cljs-cli name)
     "node-lib" (cljs-lib name)
     "web" (cljs-web name)
     (prn "unrecognized type" type))))

