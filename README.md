# TableTop reservations microservice
[![Build Status](https://travis-ci.org/TableTopLtd/tt-reservations.svg?branch=master)](https://travis-ci.org/TableTopLtd/tt-reservations)
```

## When developing

Run
```bash
mvn clean package
```
from repo root directory.

To run application local jar, run:
```bash
java -jar api/target/*.jar
```

Microservice finds database through ip

To test the service you should go to
```
http://localhost:8085/v1/reservations
```
To see a list of all reservations.

```
http://localhost:8085/v1/reservations/1
```
To see the first one, etc.

## Build docker image
```bash
docker build . -t tt-reservations:X
```

[Optional] Define your own X

## Run application in Docker
```bash
docker run -p 8085:8085 tt-reservations:X
```
