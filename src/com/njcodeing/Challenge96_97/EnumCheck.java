package com.njcodeing.Challenge96_97;

public class EnumCheck {
    public static void main(String[] args) {
        System.out.println("Total Days in a Week are:");
        for (Day day: Day.values()) {
            System.out.println(day);
        }
        System.out.println("\nWeek wise Summary:");
        for (Day day: Day.values()) {
            System.out.printf("%s : %s\n",day,day.printWeek());
        }

    }
}
