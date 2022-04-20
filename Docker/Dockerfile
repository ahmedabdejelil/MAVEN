FROM openjdk:11

COPY /var/lib/jenkins/workspace/maven-pipeline/target/*.jar /usr/src/myapp
WORKDIR /usr/src/myapp
RUN java -jar  *.jar
