# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY build/libs/LaCiguenia-0.0.1-SNAPSHOT-plain.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run java -jar /app/app.jar when the container launches
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
