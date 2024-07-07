package com.njcodeing.Challenge100;

public class MethodsThread extends Thread{
    @Override
    public void run() {
        System.out.println("You are in the method with State: "+getState());
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
