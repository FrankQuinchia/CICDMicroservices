FROM openjdk:17
WORKDIR /app
COPY ./target/MicroServiceEureka-0.0.1.jar eureka.jar
EXPOSE 9999
ENTRYPOINT [ "java","-jar","eureka.jar" ]