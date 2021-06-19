FROM adoptopenjdk/openjdk11:latest
MAINTAINER carl.devoos
COPY "./target/hosplima-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]