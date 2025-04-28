# Use the official OpenJDK 17 image from Docker Hub
FROM openjdk:17

# Set working directory inside the container
WORKDIR /app

# Copy the compiled Java application JAR file into the container
COPY ./target/aim.jar /app

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# Set environment variables for database connection (optional)
<<<<<<< HEAD
ENV DB_HOST=aimdb.cvqg0iekc8d2.ap-south-1.rds.amazonaws.com
ENV DB_PORT=3306
ENV DB_NAME=aim
ENV DB_USER=root
ENV DB_PASSWORD=password

# Command to run the application
CMD ["java", "-jar", "aim.jar"]
=======
ENV DB_HOST=database-oneaim.c5g0qwsu6m3a.ap-south-1.rds.amazonaws.com
ENV DB_PORT=3306
ENV DB_NAME=database_oneaim
ENV DB_USER=admin_oneaim
ENV DB_PASSWORD=theoneaim03

# Command to run the application
CMD ["java", "-jar", "aim.jar"]
>>>>>>> 5d64f8d57e3fce7ec763847c0e2d0fb7ecd5efcf
