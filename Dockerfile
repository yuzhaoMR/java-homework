FROM openjdk:11.0.5-stretch
MAINTAINER yz <yz@gmail.com>
RUN /bin/sh -c "mvn package"
VOLUME /tmp
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 9090