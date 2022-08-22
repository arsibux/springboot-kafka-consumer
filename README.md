# Springboot Kafka Consumer

[Apache Kafka](https://kafka.apache.org/) is an open-source distributed event streaming platform for high-performance
data pipelines, streaming analytics, data integration, and mission-critical applications.

![kafka consumer service](https://github.com/arsibux/springboot-kafka-consumer/blob/main/draw_io/kafka-consumer.drawio.png "kafka consumer service")

## Installation

1. Run command at code directory `git clone https://github.com/arsibux/springboot-kafka-consumer.git`.
2. Run `docker-compose up -d` [docker-desktop installaton](https://docs.docker.com/desktop/)
3. Open Project in [IntelliJ Idea](https://www.jetbrains.com/idea/download/).
4. Run `mvn clean install` and run `mvn spring-boot:run`
5. Run in terminal `docker exec --interactive --tty kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic MESSAGE-TOPIC --from-beginning`

6. Run [kafka producer springboot application](https://github.com/arsibux/springboot-kafka-producer) in intelliJ.
7. Import workspace file of [Postman](https://www.postman.com/downloads/)
   at `${root}/postman/kafka-producer.postman_collection` into postman.
8. Send API request `{{baseurl}}/publish` in postman for producer application.

![postman-api-call](https://github.com/arsibux/springboot-kafka-consumer/blob/main/docs/img/postman-api-call.png "postman-api-call")

8. You can verify the messages terminal.

![terminal](https://github.com/arsibux/springboot-kafka-consumer/blob/main/docs/img/verify.png "terminal")

