(ns {{name}}.app)

(enable-console-print!)

(println "src/{{name}}/app.cljs")

(defn on-js-reload []
  (println "reloaded"))

(defn ^:export main []
  (println "{{name}}.app/main")
  (on-js-reload))

(set! js/cljs-entry-point main)

(main)
