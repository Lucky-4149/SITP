# Stage 1: Build the application with Maven and OpenJDK 17
FROM maven:3.8.8-openjdk-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy pom.xml and download dependencies (caching this layer)
COPY pom.xml .

RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the project and skip tests for faster build
RUN mvn clean package -DskipTests

# Stage 2: Run the application with OpenJDK 17 slim image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar built in the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "app.jar"]
