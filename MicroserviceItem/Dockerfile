FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceItem-0.0.1-SNAPSHOT.jar item.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","item.jar" ]