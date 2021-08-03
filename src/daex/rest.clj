(ns daex.rest-main
  (:require [daex.nrepl]
            [daex.impl]
            [daex.io]
            [daex.dgraph]
            [daex.rest-server]
   ;
            )
  ;
  )


(defn -dev  [& args]
  (daex.nrepl/-main)
  (daex.rest-server/run-dev)
  )

(defn -main  [& args]
  (daex.nrepl/-main)
  )

(comment
  
  (daex.impl/try-parse-int "3")
  
  (daex.impl/version)
  
  
  ;
  )