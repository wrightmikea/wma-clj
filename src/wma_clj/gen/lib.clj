(ns wma-clj.gen.lib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn clj-lib
  "generates a Clojure library project"
  [name]
  (prn "tbd lib" name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'library' project.")
       (->files data
                ["project.clj" (render "lib/project.clj" data)]
                ["src/{{sanitized}}/{{sanitized}}.clj"
                 (render "lib/foo.clj" data)]
                ["test/{{sanitized}}/{{sanitized}}_test.clj"
                 (render "lib/foo_test.clj" data)])))
