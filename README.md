# Headstarter Backend Code Compiler

## Building docker image
```shell
docker image build . -t headstartercodecompiler
```

## Running docker container
```shell
docker container run -dp 8080:8082 -v /var/run/docker.sock:/var/run/docker.sock -t headstartercodecompiler --env DELETE_DOCKER_IMAGE=false
```