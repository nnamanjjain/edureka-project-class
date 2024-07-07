package com.njcodeing.Challenge102;

public enum SignalTraffic {
    RED(5000),
    YELLOW(2500),
    GREEN(4000);
    private final long signalTime;
//time is in milliseconds
    public long getSignalTime() {
        return signalTime;
    }

    SignalTraffic(long signalTime) {
        this.signalTime = signalTime;
    }
}
