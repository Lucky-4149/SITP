# Use an OpenJDK 17 base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the image (you must build the project before deploying)
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "app.jar"]
