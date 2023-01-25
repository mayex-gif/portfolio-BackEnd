FROM amazoncorretto:11-alpine-jdk
MAINTAINER ALCA
COPY target/alca-0.0.1-SNAPSHOT.jar alca-alejo-app.jar 
ENTRYPOINT ["java","-jar","/alca-alejo-app.jar"]