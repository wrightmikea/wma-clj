(ns leiningen.new.wma-clj
  (:require [wma-clj.gen.app :as app]
            [wma-clj.gen.cli :as cli]
            [wma-clj.gen.node-cli :as node-cli]
            [wma-clj.gen.node-lib :as node-lib]
            [wma-clj.gen.park :as park]
            [wma-clj.gen.lib :as lib]
            [wma-clj.gen.web-app :as web-app]))

(defn cljs-kafka-client
  "generates a ClojureScript node-kafka-client project"
  [name]
  (prn "tbd node-kafka-client" name))

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
     "park-filter" (park/clj-park-filter name)
     "web-app" (web-app/cljs-web-app name)
     (println "unrecognized type" type
              "\nusage:"
              "\nlein new wma-clj app"
              "\nlein new wma-clj cli"
              "\nlein new wma-clj node-cli"
              "\nlein new wma-clj node-lib"
              "\nlein new wma-clj park-filter"
              "\nlein new wma-clj lib"
              "\nlein new wma-clj web-app"))))

