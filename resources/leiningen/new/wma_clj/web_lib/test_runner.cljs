(ns {{name}}.test-runner
  (:require [{{name}}.lib-test]
            [doo.runner :refer-macros [doo-tests]]))

(enable-console-print!)

(doo-tests '{{name}}.lib-test)
