FROM maven:3.9.1-openjdk-8 AS build
WORKDIR /app
COPY . /app/
RUN mvn clean package

From openjdk:8-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]