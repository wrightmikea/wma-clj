(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write Application description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.5.3"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [xd-filters/xd-filters "0.1.0-SNAPSHOT"]]
  :target-path "target/%s"
  :aot [{{name}}.filter])
