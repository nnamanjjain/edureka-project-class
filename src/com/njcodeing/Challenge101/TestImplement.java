package com.njcodeing.Challenge101;

public class TestImplement {
    public static void main(String[] args) throws InterruptedException {
        MethodForThreads t0=new MethodForThreads();
        MethodForThreads t1=new MethodForThreads();
        MethodForThreads t2=new MethodForThreads();
        System.out.printf("%s is %s/Created\n",t0.getName(), t0.getState());
        t0.start();
        t0.join();
        System.out.printf("%s is now %s\n",t0.getName(), t0.getState());

        System.out.printf("\n%s is %s/Created\n",t1.getName(), t1.getState());
        t1.start();
        t1.join();
        System.out.printf("%s is now %s\n",t1.getName(), t1.getState());

        System.out.printf("\n%s is %s/Created\n",t2.getName(), t2.getState());
        t2.start();
        t2.join();
        System.out.printf("%s is now %s",t2.getName(), t2.getState());

    }
}
