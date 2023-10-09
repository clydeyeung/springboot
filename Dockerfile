FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/Spring-boot-tutorial-0.0.1-SNAPSHOT.jar Spring-boot-tutorial-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dserver.port=$PORT","-jar","/Spring-boot-tutorial-0.0.1-SNAPSHOT.jar"]
#EXPOSE 8080:8080
