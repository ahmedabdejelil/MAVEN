FROM openjdk:11

WORKDIR /usr/src/myapp

COPY /var/lib/jenkins/workspace/maven-pipeline/target/JavaHelloWord-2.0-SNAPSHOT.jar /usr/src/myapp
RUN java -jar  JavaHelloWord-2.0-SNAPSHOT.jar
