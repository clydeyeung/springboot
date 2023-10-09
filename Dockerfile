FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/Spring-boot-tutorial-0.0.1-SNAPSHOT.jar Spring-boot-tutorial-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring-boot-tutorial-0.0.1-SNAPSHOT.jar","--server.port=$PORT"]
#EXPOSE 8080:8080
