(ns test.check
(:require [clojure.core.typed :as t]
                [clojure.template :as template]
                [clojure.repl :as repl]
                [clojure.data :as data] 
                [clojure.instant :as instant]
                [clojure.set :as set]
                [test.core]))


(template/apply-template '[a b c d e] '[d a b e c e b a d] '(1 2 3 4 5))
(repl/apropos "clojure")
(repl/demunge "clojure.repl$demunge")
(repl/source-fn 'source)
(instant/read-instant-timestamp "2014-04-23T10:13Z")
(instant/read-instant-date "2014-04-23T10:13Z")
(instant/read-instant-calendar "2014-04-23T10:13Z")
(set/subset? #{1} #{2})
(set/superset? #{1} #{2})
(set/join #{ {:a 1} {:a 2} }  #{ {:b 1} {:b 2} })
(set/index #{ {:a 1 :b 2} {:a 3 :b 4} {:a 1 :b 5} {:a 2 :b 6} } [:a])
(set/map-invert {:a 1, :b 2})
(set/project #{  {:a "b" :c 1} {:a "d" :c 2} } [:a])
(set/rename #{  {:a 1, :b 1}  {:a 2, :b 2} } {:a :new-a})
(set/rename-keys {:a 1, :b 2} {:a :new-a, :b :new-b})
(set/select odd? #{1 2 3} )
(data/diff '[1 2 3] '[1 2])
 

