#!/bin/bash
read -p 'quay_build: ' quay_build
if [ -z "$quay_build" ]
then
    echo "invalid quay_build"
    exit
fi
echo "$quay_build" > "/Users/varunvijayakumar/d_scripts/current_image.txt"
