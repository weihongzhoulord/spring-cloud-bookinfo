# Can be used for details, ratings
FROM openjdk:8-alpine3.9
WORKDIR /app
ARG TARGET=$TARGET
COPY ${TARGET}/build/libs/ /app

ENV TZ Asia/Shanghai
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]