FROM openjdk:11
COPY ./target/spring-session-210115-0.0.1-SNAPSHOT.jar /usr/src/spring-session-210115/
WORKDIR /usr/src/spring-session-210115/
EXPOSE 8080
CMD ["java", "-jar", "spring-session-210115-0.0.1-SNAPSHOT.jar"]