(defproject chatbot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [pneumatic-tubes "0.3.0"]
                 [org.clojure/core.async "0.4.474"]
                 [stylefruits/gniazdo "1.0.1"]]
  :main ^:skip-aot chatbot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
