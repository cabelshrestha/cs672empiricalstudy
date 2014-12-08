#!/bin/bash
function start_eclipse(){
timestamp=$(date +"%Y-%m-%d_%H.%M.%S")
recordmydesktop --no-sound --v_quality=30 -o $1/${timestamp}-video.ogv --fps=15 --no-frame --on-the-fly-encoding &
PID=$!
var=1
while [ $var -eq 1 ]
  do
  chmod +x ~/my-experiment/luna/eclipse
  ~/my-experiment/luna/eclipse -data ${1} >>  ${1}/task.log
  var=$?
done
kill $PID
}




start_eclipse ${1}

