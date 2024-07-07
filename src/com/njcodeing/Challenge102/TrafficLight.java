package com.njcodeing.Challenge102;

public class TrafficLight extends Thread{
    SignalTraffic t;
    public TrafficLight(SignalTraffic t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.printf("%s Signal Starts for %d Seconds\n",t, t.getSignalTime()/1000);
        try {
            sleep(t.getSignalTime());//time in milliseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Signal ENDS...\n",t);
    }
}
