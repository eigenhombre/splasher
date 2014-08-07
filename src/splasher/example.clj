(ns splasher.example
  (:gen-class)
  (:require [seesaw.core :refer [native!]]
            [splasher.core :refer [splash!]])
  (:import [java.awt Toolkit]))


(defn -main []
  (native!)
  (splash! :duration 2400)
  (System/exit 0))
