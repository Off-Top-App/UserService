FROM adoptopenjdk/openjdk11
VOLUME [ "/tmp" ]
EXPOSE 8000
COPY /target/UserService-0.0.1-SNAPSHOT.jar UserService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","UserService-0.0.1-SNAPSHOT.jar"]