(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write Application description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.5.3"

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :figwheel {:on-jsload "{{name}}.app/on-js-reload"
                           :open-urls ["http://localhost:3449/index.html"]}
                :compiler {:main {{name}}.app
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/{{name}}.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/{{name}}.js"
                           :main {{name}}.app
                           :optimizations :advanced
                           :pretty-print false}}]}

  :dependencies [[doo "0.1.7"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]]

  :doo {:build "test"}

  :figwheel {:css-dirs ["resources/public/css"]}

  :main ^:skip-aot {{name}}.core

  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]
            [lein-doo "0.1.7"]
            [lein-figwheel "0.5.13"]]


  :profiles {:dev {:dependencies [[binaryage/devtools "0.9.4"]
                                  [figwheel-sidecar "0.5.13"]
                                  [com.cemerick/piggieback "0.2.2"]]
                   :source-paths ["src" "dev"]
                   :repl-options {:nrepl-middleware
                                  [cemerick.piggieback/wrap-cljs-repl]}
                   :clean-targets ^{:protect false}
                   ["resources/public/js/compiled" :target-path]}
             :uberjar {:aot :all}}

  :source-paths ["src"]

  :target-path "target/%s"
  )
