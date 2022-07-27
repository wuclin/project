package org.example;

import com.rabbitmq.client.*;

import java.io.IOException;



public class CustomRecv {
    private final static String QUEUE_NAME = "queue_test_01";

    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionUtil.getConnection();
        final Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        //pull方法
        GetResponse response = channel.basicGet(QUEUE_NAME, false);
        System.out.println(new String(response.getBody()));
        channel.basicAck(response.getEnvelope().getDeliveryTag(), false);
        //push

    }

}
