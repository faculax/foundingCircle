(ns loan-allocation-challenge.loan-gen-test
  (:require [clojure.test :refer :all]
            [loan-allocation-challenge.loan-gen :as gen]))


(deftest loan-gen-test
  (testing "Basic usage test"
    (let [n 10
          required-keys #{:loan/id :loan/amount :loan/category :loan/risk-band}
          loans (gen/generate-loans n)]
      (is (= (count loans) n))
      (is (every? (fn [m]
                    (every? (fn [[k _]]
                              (contains? required-keys k)) m)) loans)))))