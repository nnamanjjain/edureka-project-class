package com.njcodeing.Challenge99;

public class TestThread {
    public static void main(String[] args) {
        PrintHello t1=new PrintHello();
        PrintHello t2=new PrintHello();

        t2.start();
        t1.start();
    }
}
