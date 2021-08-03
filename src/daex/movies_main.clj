(ns daex.movies-main
  (:require [daex.nrepl]
            [daex.impl]
            [daex.io]
            [daex.dgraph]
            [daex.server]
            [movies.imdb.schema]
            [daex.movies-imdb-etl]
            [daex.movies-imdb-query]
            [daex.movies-imdb-psql]
            [movies.stack.psql]
   ;
            )
  ;
  )


(defn -dev  [& args]
  (daex.nrepl/-main)
  (daex.server/run-dev)
  )

(defn -main  [& args]
  (daex.nrepl/-main)
  )

(comment
  (daex.impl/try-parse-int "3")
  
  (daex.impl/version)
  
  
  ;
  )