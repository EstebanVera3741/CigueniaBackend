FROM amazoncoretto:20.0.1-alpine-jdk
COPY gradle/wrapper/gradle-wrapper.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]