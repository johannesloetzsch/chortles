(defproject chortles "1.0.0"
  :description "Just for laughs"
  :url "http://chortles.herokuapp.com"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [nrepl/drawbridge "0.2.1"]
                 [ring-basic-authentication "1.0.5"]]
  :plugins [[nrepl/drawbridge "0.2.1"]]
  :min-lein-version "2.0.0"
  :main chortles.web)
