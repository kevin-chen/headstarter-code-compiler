#!/bin/bash
for i in $(seq 1 100)
do
    curl --location --request POST 'ec2-100-27-25-207.compute-1.amazonaws.com:8080/compiler/python?memoryLimit=500&timeLimit=15' \
     --header 'Content-Type: application/json; charset=utf-8' \
     --data-raw '{
        "code": "def main():\n    print(3)\n\nmain()"
     }' &
#   ( Generating random numbers here , sorting  and outputting to file$i.txt ) &
#   if (( $i % 10 == 0 )); then wait; fi # Limit to 10 concurrent subs hells.
done
wait