(ns wma-clj.gen.node-lib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn cljs-node-lib
  "generates a ClojureScript Node Library project"
  [name]
  (prn "tbd node library" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'CLJS/Node-Library' project.")
       (->files data
                [".gitignore" (render "node_lib/gitignore" data)]
                ["cider-figwheel.el" (render "node_lib/cider_figwheel.el" data)]
                ["dev.js" (render "node_lib/dev.js" data)]
                ["package.json" (render "node_lib/package.json" data)]
                ["prod.js" (render "node_lib/prod.js" data)]
                ["project.clj" (render "node_lib/project.clj" data)]
                ["src/{{sanitized}}/core.cljs"
                 (render "node_lib/foo.cljs" data)]
                ["README.md" (render "node_lib/README.md" data)]
                ["test/{{sanitized}}/core_test.cljs"
                 (render "node_lib/foo_test.cljs" data)]
                ["test/{{sanitized}}/test_runner.cljs"
                 (render "node_lib/test_runner.cljs" data)])))

