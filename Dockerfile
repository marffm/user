FROM gradle:7-jdk16-openj9 as build
WORKDIR /workspace/app
COPY . .
RUN gradle build

FROM openjdk:16-alpine as deploy
COPY --from=build /workspace/app/build/libs/*.jar /app/userApi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/userApi.jar"]