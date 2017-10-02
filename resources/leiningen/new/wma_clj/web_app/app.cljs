(ns {{name}}.app)

(enable-console-print!)

(defn on-js-reload [])

(defn ^:export main []
  (println "{{name}}.app/main")
  (on-js-reload))

(set! js/cljs-entry-point main)
