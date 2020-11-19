(ns demo.handler
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes route
  (GET "/" _ "ok"))

(def server
  (run-jetty #'route {:port 8081 :join? false}))

(.stop server)
