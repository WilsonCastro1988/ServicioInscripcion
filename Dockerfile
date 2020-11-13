FROM openjdk:8-jdk-alpine
EXPOSE 8002
ARG JAR_FILE=target/servicio-inscripcion-1.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]