FROM openjdk:19 AS BUILD

COPY settings.gradle.kts build.gradle.kts gradlew ./
COPY gradle gradle

RUN microdnf install findutils

RUN ./gradlew dependencies --refresh-dependencies

COPY src src
RUN ./gradlew bootJar jar -DskipTests

FROM openjdk:19-alpine
WORKDIR app
COPY --from=BUILD build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]