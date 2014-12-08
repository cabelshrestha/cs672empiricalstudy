#!/bin/bash
start=$(date +"%Y-%m-%d_%H.%M.%S")
start1=$(date +"%s.%N")
echo "groupe1/task3 startime was $start" >>  logs/runtime.log

bash ~/my-experiment/scripts/eclipse.sh ~/my-experiment/workspaces/myE3

end=$(date +"%Y-%m-%d_%H.%M.%S")
end1=$(date +"%s.%N")
echo "groupe1/task3 endtime was $end" >>  logs/runtime.log
runtime1=$(python -c "print '%u:%02u' % ((${end1} - ${start1})/60, (${end1} - ${start1})%60)")
echo "groupe1/task3 python runtime was $runtime1" >> logs/runtime.log
