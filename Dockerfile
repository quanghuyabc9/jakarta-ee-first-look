FROM maven:3.9.10-eclipse-temurin-21 AS maven
WORKDIR /app
COPY ./pom.xml .
RUN mvn dependency:go-offline
COPY ./src ./src
RUN mvn clean package

FROM quay.io/wildfly/wildfly:34.0.1.Final-jdk21 AS wildfly
COPY --from=maven /app/target/*.war $JBOSS_HOME/standalone/deployments