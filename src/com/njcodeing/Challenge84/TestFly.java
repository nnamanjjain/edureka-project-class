package com.njcodeing.Challenge84;

public class TestFly {
    public static void main(String[] args) {
        Bird eagle=new Eagle();//parent ref-----child obj
        Eagle bird=new Eagle();//child ref------child obj
        eagle.fly();//same output
        bird.fly();//same output
    }
}
