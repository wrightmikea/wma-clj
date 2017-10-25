(ns wma-clj.gen.web-lib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn cljs-web-lib
  "generates a ClojureScript Web Browser Library"
  [name]
  (prn "tbd web browser library" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'CLJS/Web Browser Library' project.")
       (->files data
                [".gitignore" (render "web_lib/gitignore" data)]
                ["cider-figwheel.el" (render "web_lib/cider_figwheel.el" data)]
                ["package.json" (render "web_lib/package.json" data)]
                ["project.clj" (render "web_lib/project.clj" data)]
                ["resources/public/manual_test.html"
                 (render "web_lib/manual_test.html" data)]
                ["src/{{sanitized}}/lib.cljs"
                 (render "web_lib/lib.cljs" data)]
                ["src/{{sanitized}}/manual_test.cljs"
                 (render "web_lib/manual_test.cljs" data)]
                ["test/{{sanitized}}/lib_test.cljs"
                 (render "web_lib/lib_test.cljs" data)]
                ["test/{{sanitized}}/test_runner.cljs"
                 (render "web_lib/test_runner.cljs" data)])))

