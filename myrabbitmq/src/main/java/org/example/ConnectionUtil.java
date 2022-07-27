package org.example;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
    public static Connection getConnection() throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("testHost");
        factory.setUsername("delic");
        factory.setPassword("134567846");
        Connection connection = factory.newConnection();
        return connection;
    }
}
