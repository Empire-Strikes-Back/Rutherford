#!/bin/bash

repl(){
  lein repl :start :host 0.0.0.0 :port 35543
}

"$@"
