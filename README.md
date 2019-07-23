# movieDetails-springboot

DOCKER BUILD COMMAND:

docker build -t movie-details .

gcloud auth: gcloud auth configure-docker

DOCKER GOOGLE CLOUD: docker tag movie-review gcr.io/spring-kube/movie-review

DOCKER PUSH TO GOOGLE CLOUD: docker push gcr.io/spring-kube/movie-review

DELETE IMAGE FROM GCE: gcloud container images delete gcr.io/spring-kube/movie-review

Useful Docker commands docker images docker container ls docker logs <container_name> docker container rm <container_name docker image rm <image_name
