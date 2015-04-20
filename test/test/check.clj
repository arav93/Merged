(ns test.check
(:require [clojure.core.typed :as t]
                [clojure.template :as template]
                [test.core]))


(template/apply-template '[a b c d e] '[d a b e c e b a d] '(1 2 3 4 5))
 

