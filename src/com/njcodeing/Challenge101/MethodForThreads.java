package com.njcodeing.Challenge101;

public class MethodForThreads extends Thread {
    @Override
    public void run() {
        System.out.printf("%s are going to sleep now for 5 sec\n",getName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello! Wake up! "+getName());
    }
}
