FROM quay.io/wildfly/wildfly:34.0.1.Final-jdk21
ADD target/*.war $JBOSS_HOME/standalone/deployments