# Use the official OpenJDK 17 image from Docker Hub
FROM openjdk:17

# Set working directory inside the container
WORKDIR /app

# Copy the compiled Java application JAR file into the container
COPY ./target/aim.jar /app

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# Set environment variables for database connection (optional)
ENV DB_HOST=database1-oneaim.c5g0qwsu6m3a.ap-south-1.rds.amazonaws.com
ENV DB_PORT=3306
ENV DB_NAME=aim
ENV DB_USER=admin_oneaim
ENV DB_PASSWORD=password

# Command to run the application
CMD ["java", "-jar", "aim.jar"]