(ns wma-clj.gen.park
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(defn clj-park-filter
  "generates a Clojure park-filter project"
  [name]
  (prn "tbd park filter " name)
  (let [data {:name name
              :sanitized (name-to-path name)}
        render (renderer "wma-clj")]
       (main/info "Generating fresh 'lein new' wma-clj 'park filter' project.")
       (->files data
                [".gitignore" (render "/park/gitignore" data)]
                ["project.clj" (render "/park/project.clj" data)]
                ["src/{{sanitized}}/filter.clj"
                 (render "park/clj_park_filter.clj" data)]
                ["test/{{sanitized}}/filter_test.clj"
                 (render "park/clj_park_filter_test.clj" data)])))

