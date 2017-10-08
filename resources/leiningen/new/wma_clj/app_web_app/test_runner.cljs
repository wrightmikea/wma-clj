(ns {{name}}.test-runner
  (:require [{{name}}.app-test]
            [doo.runner :refer-macros [doo-tests]]))

(enable-console-print!)

(doo-tests '{{name}}.app-test)
