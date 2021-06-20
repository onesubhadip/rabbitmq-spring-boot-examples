### Run standalone rabbitmq docker node
```
docker network create rabbits
docker run -d --rm --net rabbits --hostname rabbit-node1 --name rabbit-node1 -p 15672:15672 -p 5672:5672 rabbitmq:3.8-management
```
This will run RabbitMQ with the management plugin enabled for RabbitMQ dashboard `http://localhost:15672`
