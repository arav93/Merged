(ns test.core 
(:require [clojure.core.typed :as t]))

(t/ann ^:no-check clojure.template/apply-template [ (t/HVec [t/Any *]) (t/HVec [t/Any *])(t/List t/Any ) -> (t/HVec [t/Any *])])




