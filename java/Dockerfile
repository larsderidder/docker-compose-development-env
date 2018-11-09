FROM maven:3.5-jdk-8

COPY . /usr/src/app
WORKDIR /usr/src/app

RUN apt-get update && apt-get install entr -y

RUN mvn clean package --batch-mode
ENTRYPOINT java -jar target/docker-compose-java-example-1.0-SNAPSHOT.jar
