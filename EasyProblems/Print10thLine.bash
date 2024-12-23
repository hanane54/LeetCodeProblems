# Read from the file file.txt and output the content of the 10th line to stdout.
#!/usr/bin/env bash

file="file.txt"

i=0
# IFS= preserves leading/trailing whitespace
# -r prevents backslash escapes from being interpreted
while IFS=$'\n' read -r line
do
    ((i++))
    if [ $i -eq 10 ]
    then
        echo "$line"
        break
    fi
done < "$file"

#if [ $i -lt 10 ]
#then
 #   echo "File has less than 10 lines. Only $i lines found."
#fi