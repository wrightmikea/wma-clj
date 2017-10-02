(defproject {{name}}-node "0.1.0-SNAPSHOT"
  :description "{{name}} FIXME: write this!"
  :url "http://example.com/{{name}}/FIXME"

  :min-lein-version "2.7.1"

  :dependencies [[doo "0.1.7"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [wma-cljs-macs/wma-cljs-macs "0.1.0-SNAPSHOT"]]

  :doo {:build "test"}

  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]
            [lein-doo "0.1.7"]
            [lein-figwheel "0.5.13"]]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src"]

  :clean-targets ["server.js"
                  "target"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {
                :main {{name}}.core
                :asset-path "target/js/compiled/dev"
                :output-to "target/js/compiled/{{name}}_node.js"
                :output-dir "target/js/compiled/dev"
                :target :nodejs
                :optimizations :none
                :source-map-timestamp true}}
             {:id "prod"
              :source-paths ["src"]
              :compiler {
                :output-to "server.js"
                :output-dir "target/js/compiled/prod"
                :target :nodejs
                         :optimizations :simple}}
                           {:id "test"
                :source-paths ["src" "test"]
               :compiler {
                 :main {{name}}.test-runner
                 :output-to "resources/public/cljs/tests/all-tests.js"
                 :target :nodejs}}]}

  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.13"]
                                  [com.cemerick/piggieback "0.2.2"]]
                   :source-paths ["src" "dev"]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
  :figwheel {:server-port 3333
             :nrepl-port 7777})
