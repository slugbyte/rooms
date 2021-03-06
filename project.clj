(defproject rooms "0.1.0-SNAPSHOT"
  :description "A simple multiplayer text game"
  :url "https://www.github.com/slugbyte/rooms"
  :license {:name "MIT"
            :url "https://github.com/slugbyte/rooms/blob/master/LICENSE.md"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.7.559"]]
  :profiles {:server {:main server.core}
             :client {:main client.core}
             :uberjar {:aot :all}})
