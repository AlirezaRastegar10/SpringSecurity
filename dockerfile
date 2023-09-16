FROM openjdk:17-jdk

WORKDIR /app

COPY target/security-0.0.1-SNAPSHOT.jar /app/security.jar

EXPOSE 8080

CMD ["java", "-jar", "security.jar"]