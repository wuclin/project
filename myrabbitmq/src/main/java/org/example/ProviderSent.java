package org.example;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class ProviderSent {
    private final static String QUEUE_NAME = "queue_test_01";

    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        String message = "Hello rabbit";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        channel.close();
        connection.close();

    }
}
