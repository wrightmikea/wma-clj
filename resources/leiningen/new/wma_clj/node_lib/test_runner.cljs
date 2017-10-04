(ns {{name}}.test-runner
  (:require [{{name}}.core-test]
            [doo.runner :refer-macros [doo-tests]]))

(enable-console-print!)

(doo-tests '{{name}}.core-test)
