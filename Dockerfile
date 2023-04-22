FROM openjdk:11
VOLUME /tmp
ADD target/demo-docker-file-0.0.1-SNAPSHOT.jar demo-docker-file-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/demo-docker-file-0.0.1-SNAPSHOT.jar"]