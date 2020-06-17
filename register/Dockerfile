FROM maven:3.6.0-jdk-11-slim AS build
MAINTAINER yz <yuzhaomr@gmail.com>

WORKDIR /app/
COPY ./src ./src
COPY ./pom.xml .
RUN mvn -f pom.xml clean package

FROM openjdk:11.0.5-stretch AS jdk
VOLUME /tmp
COPY --from=build ./app/target/register-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Djava.profiles.active=docker","-jar","/app.jar"]
EXPOSE 9090