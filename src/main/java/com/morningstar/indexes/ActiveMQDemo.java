package com.morningstar.indexes;

public class ActiveMQDemo {
    public static void main(String[] args) throws InterruptedException {
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        Thread.sleep(1000);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        Thread.sleep(1000);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        Thread.sleep(1000);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldConsumer(), false);
        thread(new HelloWorldProducer(), false);
    }

    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }
}
