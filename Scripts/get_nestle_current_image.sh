#!/bin/bash
input="/Users/varunvijayakumar/d_scripts/current_image.txt"
while IFS= read -r line
do
  echo "$line"
done < "$input"
