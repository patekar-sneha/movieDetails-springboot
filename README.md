# movieDetails-springboot

DOCKER BUILD COMMAND:

docker build -t movie-details .

gcloud auth: gcloud auth configure-docker

DOCKER GOOGLE CLOUD: docker tag movie-details gcr.io/spring-kube/movie-details

DOCKER PUSH TO GOOGLE CLOUD: docker push gcr.io/spring-kube/movie-details

DELETE IMAGE FROM GCE: gcloud container images delete gcr.io/spring-kube/movie-details

Useful Docker commands docker images docker container ls docker logs <container_name> docker container rm <container_name docker image rm <image_name
