package com.example.rabbitmq.topic;

import com.example.rabbitmq.config.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;

/**
 * @Author: lxy
 * @Date: 2019/1/17 14:53
 * 订阅模型-通过RoutingKey匹配  可有通配符
 * #：匹配一个或多个词
 * *：匹配不多不少恰好1个词
 */
public class Send {
    private final static String EXCHANGE_NAME = "topic_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明exchange，指定类型为topic   true：交换机持久化
        channel.exchangeDeclare(EXCHANGE_NAME, "topic",true);
        // 消息内容
        String message = "新增商品 : id = 13421";
        // 发送消息，并且指定routing key 为：insert ,代表新增商品  MessageProperties.PERSISTENT_TEXT_PLAIN:消息持久化
        channel.basicPublish(EXCHANGE_NAME, "item.insert", MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
        System.out.println(" [后台系统：] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}
