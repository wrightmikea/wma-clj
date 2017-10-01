(ns wma-clj.gen.app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn clj-app
  "generates a Clojure Application project"
  [name]
  (prn "tbd app" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'command line' project.")
       (->files data
                [".gitignore" (render "app/gitignore" data)]
                ["project.clj" (render "app/project.clj" data)]
                ["src/{{sanitized}}/core.clj"
                 (render "app/core.clj" data)]
                ["test/{{sanitized}}/core_test.clj"
                 (render "app/core_test.clj" data)])))

