FROM openjdk:8-jdk-alpine
LABEL maintainer="projectinformatic1196@gmail.com"
WORKDIR /workspace




ENV DOCKERIZE_VERSION v0.6.1

ADD target/Proyecto_bootcamp-0.0.1-SNAPSHOT*.jar Proyecto_bootcamp-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT exec java -jar  /workspace/Proyecto_bootcamp-0.0.1-SNAPSHOT.jar

