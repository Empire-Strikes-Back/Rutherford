(ns daex.main
  (:require [daex.nrepl]
            [daex.impl]
            [daex.io]
            [daex.dgraph]
            [daex.server]
            [daex.datomic-mbrainz]
            [daex.datomic-starcraft-etl]
            [daex.datomic-seattle]
            [daex.datomic-gitexp]
            [daex.schema]
   
   ;
            )
  ;
  )


(defn -dev  [& args]
  (daex.nrepl/-main)
  ; (daex.server/run-dev)
  )

(defn -main  [& args]
  (daex.nrepl/-main)
  )

(comment
  
  (daex.impl/try-parse-int "3")
  
  (daex.impl/version)
  
  
  ;
  )