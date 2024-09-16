# Build stage
FROM maven:3.8.7-openjdk-21 AS build\
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage