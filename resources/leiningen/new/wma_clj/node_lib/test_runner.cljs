(ns {{name}}.test-runner
  (:require [{{name}}.{{name}}-test]
            [doo.runner :refer-macros [doo-tests]]))

(enable-console-print!)

(doo-tests '{{name}}.{{name}}-test)
