(ns wma-clj.gen.web-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn cljs-web-app
  "generates a ClojureScript Web Browser Application"
  [name]
  (prn "tbd web browser application" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'CLJS/Web Browser Application' project.")
       (->files data
                [".gitignore" (render "web_app/gitignore" data)]
                ["cider-figwheel.el" (render "web_app/cider_figwheel.el" data)]
                ["package.json" (render "web_app/package.json" data)]
                ["project.clj" (render "web_app/project.clj" data)]
                ["resources/public/css/style.css"
                 (render "web_app/style.css" data)]
                ["resources/public/index.html"
                 (render "web_app/index.html" data)]
                ["src/{{sanitized}}/app.cljs"
                 (render "web_app/app.cljs" data)]
                ["test/{{sanitized}}/app_test.cljs"
                 (render "web_app/app_test.cljs" data)]
                ["test/{{sanitized}}/test_runner.cljs"
                 (render "web_app/test_runner.cljs" data)])))

