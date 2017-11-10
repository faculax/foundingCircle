(ns loan-allocation-challenge.loan-gen
  (:import (java.util UUID)))

(defn generate-loan []
  {:loan/category (rand-nth [:property :retail :medical])
   :loan/risk-band (rand-nth [:A+ :A :B :C :D :E])
   :loan/amount (int (rand 10000000))
   :loan/id (UUID/randomUUID)})

(defn generate-loans [n]
  (->> (repeatedly generate-loan)
       (take n)))
