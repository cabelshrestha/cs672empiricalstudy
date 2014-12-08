#!/bin/bash
start=$(date +"%Y-%m-%d_%H.%M.%S")
start1=$(date +"%s.%N")
echo "groupne2/task1 startime was $start" >>  logs/runtime.log

bash ~/my-experiment/scripts/eclipse.sh ~/my-experiment/workspaces/myNE1

end=$(date +"%Y-%m-%d_%H.%M.%S")
end1=$(date +"%s.%N")
echo "groupne2/task1 endtime was $end" >>  logs/runtime.log
runtime1=$(python -c "print '%u:%02u' % ((${end1} - ${start1})/60, (${end1} - ${start1})%60)")
echo "groupne2/task1 python runtime was $runtime1" >> logs/runtime.log
