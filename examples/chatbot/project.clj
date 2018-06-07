(defproject chatbot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.4.474"]
                 [stylefruits/gniazdo "1.0.1"]
                 [com.cognitect/transit-clj "0.8.300"]]
  :main ^:skip-aot chatbot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :repl {:plugins [[cider/cider-nrepl "0.16.0"]]
                    :dependencies [[org.clojure/tools.nrepl "0.2.12"]]}})
