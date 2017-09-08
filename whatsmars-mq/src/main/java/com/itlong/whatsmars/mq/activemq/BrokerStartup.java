package com.itlong.whatsmars.mq.activemq;

import org.apache.activemq.broker.BrokerService;

/**
 * Created by shenhongxi on 2017/9/8.
 */
public class BrokerStartup {

    public static void main(String[] args) throws Exception {
        // BrokerService broker =BrokerFactory.createBroker(new URI("broker:tcp://localhost:61616"));
        BrokerService broker =new BrokerService();
        broker.setBrokerName("TestBroker"); // 如果启动多个Broker时，必须为Broker设置一个名称
        broker.addConnector("tcp://127.0.0.1:61616");
        broker.start();
    }
}
