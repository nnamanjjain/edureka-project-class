package com.njcodeing.Challenge99;

public class PrintHello extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("HELLO: %s \n", getName());
        }
    }
}
