#!/bin/bash
read -p 'local_build: ' local_build
read -p 'quay_build: ' quay_build
if [ -z "$local_build" ]
then
    echo "invalid local_build"
    exit
fi
if [ -z "$quay_build" ]
then
    echo "invalid quay_build"
    exit
fi
quay_build="quay.io/arubadevops/devcontainers:$quay_build"
docker_tag="docker tag $local_build $quay_build"
docker_push="docker push $quay_build"
echo $docker_tag
$docker_tag
echo $docker_push
$docker_push
