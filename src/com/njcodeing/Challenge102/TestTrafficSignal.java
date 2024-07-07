package com.njcodeing.Challenge102;

public class TestTrafficSignal {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red=new TrafficLight(SignalTraffic.RED);
        TrafficLight yellow=new TrafficLight(SignalTraffic.YELLOW);
        TrafficLight green=new TrafficLight(SignalTraffic.GREEN);
        red.start();
        red.join();

        yellow.start();
        yellow.join();

        green.start();

    }
}
