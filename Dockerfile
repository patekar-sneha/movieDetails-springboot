FROM openjdk:8u131-jdk-alpine
WORKDIR /spring
COPY . /spring
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "/spring/target/movieDetails-0.0.1-SNAPSHOT.jar"]
