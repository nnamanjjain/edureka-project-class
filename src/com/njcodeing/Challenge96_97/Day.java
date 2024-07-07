package com.njcodeing.Challenge96_97;

public enum Day {
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    private final boolean isWeekday;
    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
     String printWeek(){
        return isWeekday ? "Weekday" : "Weekend";
    }
    public boolean getIsWeekday() {
        return isWeekday;
    }
}
