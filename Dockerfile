FROM openjdk:8-jdk-alpine
COPY --from=build build/libs/continuous-delivery-demo-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]