(ns leiningen.new.wma-clj
  (:require [wma-clj.gen.app :as app]
            [wma-clj.gen.cli :as cli]
            [wma-clj.gen.park :as park]
            [wma-clj.gen.lib :as lib]))

(defn cljs-cli
  "generates a ClojureScript node-CLI project"
  [name]
  (prn "tbd node-cli" name))

(defn cljs-kafka-client
  "generates a ClojureScript node-kafka-client project"
  [name]
  (prn "tbd node-kafka-client" name))

(defn cljs-lib
  "generates a ClojureScript node-library project"
  [name]
  (prn "tbd node-lib" name))

(defn cljs-web
  "generates a ClojureScript web browser application"
  [name]
  (prn "tbd web browser app" name))

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
     "park" (park/clj-park-client name)
     "web" (cljs-web name)
     (prn "unrecognized type" type))))

