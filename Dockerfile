FROM openjdk:8-jre-alpine

RUN mkdir /app

WORKDIR /app

ADD ./api/target/reservations-api-1.0.0-SNAPSHOT.jar /app

EXPOSE 8085

CMD ["java", "-jar", "reservations-api-1.0.0-SNAPSHOT.jar"]
