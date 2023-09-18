FROM gradle:8.2.1 AS BUILD
WORKDIR /app

COPY build.gradle.kts settings.gradle.kts /app/

RUN gradle wrapper
RUN gradle dependencies --refresh-dependencies

COPY src src

RUN gradle bootJar jar -DskipTests

FROM openjdk:19-alpine
COPY --from=BUILD /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]
