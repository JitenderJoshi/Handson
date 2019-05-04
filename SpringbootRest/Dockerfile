#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /root/build/src
COPY pom.xml /root/build
RUN mvn -f /root/build/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /root/build/target/SpringbootRest-0.0.1-SNAPSHOT.jar /root/build/SpringbootRest.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/root/build/SpringbootRest.jar"]
