package org.example.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq/api/v1")
public class RabbitMQController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/hello")
    public String hello() {
        rabbitTemplate.convertAndSend("topic.exchange", "order.create", "订单创建消息");
        rabbitTemplate.convertAndSend("topic.exchange", "order.update", "订单更新消息");
        return "hello";
    }
}
