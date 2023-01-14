FROM amazoncorretto:11-alpine-jdk //De que imagen partimos
MAINTAINER ALCA // Dueño
COPY target/alca-0.0.1-SNAPSHOT.jar alca-app.jar //Copia el empaquetado a GitHub
ENTRYPOINT ["java","-jar","/alca-app.jar"] //Lo primero a ejecutar