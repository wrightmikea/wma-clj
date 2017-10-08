(ns wma-clj.gen.app-web-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn clj-app-cljs-web-app
  "generates a Clojure Application project"
  [name]
  (prn "tbd clj app" name "cljs web app" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render-from (fn [name] ((renderer "wma-clj")
                                (str "app_web_app/" name)
                                data))]
       (main/info "Generating fresh 'lein new' wma-clj 'app-web-app' project.")
       (->files data
                [".gitignore" (render-from "gitignore")]
                ["cider-figwheel.el" (render-from "cider_figwheel.el")]
                ["package.json" (render-from "package.json" )]
                ["project.clj" (render-from "project.clj" )]
                ["resources/public/css/style.css"
                 (render-from "style.css" )]
                ["resources/public/index.html"
                 (render-from "index.html" )]
                ["src/{{sanitized}}/app.cljs"
                 (render-from "app.cljs" )]
                ["test/{{sanitized}}/app_test.cljs"
                 (render-from "app_test.cljs" )]
                ["src/{{sanitized}}/core.clj"
                 (render-from "core.clj" )]
                ["test/{{sanitized}}/core_test.clj"
                 (render-from "core_test.clj" )]
                ["test/{{sanitized}}/test_runner.cljs"
                 (render-from "test_runner.cljs" )])))
