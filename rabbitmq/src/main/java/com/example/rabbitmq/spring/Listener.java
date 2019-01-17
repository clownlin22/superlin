package com.example.rabbitmq.spring;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: lxy
 * @Date: 2019/1/17 15:15
 */
@Component
public class Listener {

    @RabbitListener(bindings = @QueueBinding(
            //队列名字   是否持久化
            value = @Queue(value = "spring.test.queue", durable = "true"),
            //交换机名字  交换机类型
            exchange = @Exchange(
                    value = "spring.test.exchange",
                    type = ExchangeTypes.TOPIC
            ),
            //匹配规则
            key = {"#.#"}))
    public void listen(String msg){
        System.out.println("接收到消息：" + msg);
    }
}
