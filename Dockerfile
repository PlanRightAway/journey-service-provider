FROM openjdk:latest
ADD ./target/journey-service-provider-0.0.1-SNAPSHOT.jar journey-service-provider.jar
ENTRYPOINT java -jar journey-service-provider.jar --eureka.client.serviceUrl.defaultZone=$EUREKA_SERVER --eureka.instance.hostname=$(curl ifconfig.me)