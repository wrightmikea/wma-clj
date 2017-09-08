(ns wma-clj.gen.cli
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn clj-cli
  "generates a Clojure CLI project"
  [name]
  (prn "tbd cli" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'command line' project.")
       (->files data
                ["project.clj" (render "cli/project.clj" data)]
                ["src/{{sanitized}}/{{sanitized}}.clj"
                 (render "cli/foo.clj" data)]
                ["test/{{sanitized}}/{{sanitized}}_test.clj"
                 (render "cli/foo_test.clj" data)])))

