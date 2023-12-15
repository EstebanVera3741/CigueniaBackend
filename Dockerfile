FROM amazoncorretto:latest
COPY gradle/wrapper/gradle-wrapper.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]