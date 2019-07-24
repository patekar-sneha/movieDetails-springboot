FROM openjdk:8u131-jdk-alpine
WORKDIR /spring/moviedetails
COPY . /spring/moviedetails
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "/spring/moviedetails/target/movieDetails-0.0.1-SNAPSHOT.jar"]
