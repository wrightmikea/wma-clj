(ns leiningen.new.wma-clj
  (:require [wma-clj.gen.app :as app]
            [wma-clj.gen.cli :as cli]
            [wma-clj.gen.node-cli :as node-cli]
            [wma-clj.gen.node-lib :as node-lib]
            [wma-clj.gen.park :as park]
            [wma-clj.gen.lib :as lib]))

(defn cljs-kafka-client
  "generates a ClojureScript node-kafka-client project"
  [name]
  (prn "tbd node-kafka-client" name))

(defn cljs-web-app
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
     "node-cli" (node-cli/cljs-node-cli name)
     "node-lib" (node-lib/cljs-node-lib name)
     "park" (park/clj-park-client name)
     "web" (cljs-web-app name)
     (prn "unrecognized type" type))))

