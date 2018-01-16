# TableTop payments microservice
[![Build Status](https://travis-ci.org/TableTopLtd/tt-payments.svg?branch=master)](https://travis-ci.org/TableTopLtd/tt-payments)
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
http://localhost:8086/v1/payments
```
To see a list of all payments.

```
http://localhost:8086/v1/payments/1
```
To see the first one, etc.

## Build docker image
```bash
docker build . -t tt-payments:X
```

[Optional] Define your own X

## Run application in Docker
```bash
docker run -p 8086:8086 tt-payments:X
```
