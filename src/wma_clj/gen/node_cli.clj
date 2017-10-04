(ns wma-clj.gen.node-cli
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn cljs-node-cli
  "generates a ClojureScript Node CLI project"
  [name]
  (prn "tbd node CLI" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'CLJS/Node-CLI' project.")
       (->files data
                [".gitignore" (render "node_cli/gitignore" data)]
                ["cider-figwheel.el" (render "node_cli/cider_figwheel.el" data)]
                ["dev.js" (render "node_cli/dev.js" data)]
                ["package.json" (render "node_cli/package.json" data)]
                ["prod.js" (render "node_cli/prod.js" data)]
                ["project.clj" (render "node_cli/project.clj" data)]
                ["src/{{sanitized}}/core.cljs"
                 (render "node_cli/core.cljs" data)]
                ["README.md" (render "node_cli/README.md" data)]
                ["test/{{sanitized}}/core_test.cljs"
                 (render "node_cli/core_test.cljs" data)]
                ["test/{{sanitized}}/test_runner.cljs"
                 (render "node_cli/test_runner.cljs" data)])))

