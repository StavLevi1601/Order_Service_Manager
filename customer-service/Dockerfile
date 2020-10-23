FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE='target/*.jar'
COPY ${JAR_FILE} package.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/package.jar"]
