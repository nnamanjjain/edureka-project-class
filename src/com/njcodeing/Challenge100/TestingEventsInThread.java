package com.njcodeing.Challenge100;

public class TestingEventsInThread {
    public static void main(String[] args) throws InterruptedException {

        MethodsThread t1=new MethodsThread();

        System.out.println("You have create the Thread with State: "+t1.getState());
        t1.start();
        t1.join();
        System.out.println("Thread is Terminated with State: "+t1.getState());

    }
}
