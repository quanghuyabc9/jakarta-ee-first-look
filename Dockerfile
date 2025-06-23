FROM maven:3.9.9-eclipse-temurin-21 AS maven
WORKDIR /app
COPY pom.xml .
COPY ./src .
RUN mvn clean package

FROM quay.io/wildfly/wildfly:34.0.1.Final-jdk21 AS wildfly
COPY --from=maven /app/target/*.war $JBOSS_HOME/standalone/deployments
