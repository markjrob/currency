FROM openjdk:11
ADD target/callapi-0.0.1-SNAPSHOT.jar callapi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "callapi-0.0.1-SNAPSHOT.jar"]