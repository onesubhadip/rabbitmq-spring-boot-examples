### Simple Spring boot producer application
- exposes REST endpoint to accept messages 
  `curl -i -X POST http://localhost:8081/Hello World`
- writes the message to RabbitMQ exchange with static routing key
