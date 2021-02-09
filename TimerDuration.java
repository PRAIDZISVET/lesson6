package com.itacademy.lesson6;

public class TimerDuration {

    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    private int seconds;
    private int minutes;
    private int hours;

    public TimerDuration(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimerDuration (int totalSeconds) {
        this.hours = totalSeconds / MINUTES_IN_HOUR / SECONDS_IN_MINUTE;
        this.minutes = totalSeconds % SECONDS_IN_HOUR / MINUTES_IN_HOUR;
        this.seconds = totalSeconds % SECONDS_IN_MINUTE;
    }

    public int totalSeconds () {
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR;
    }

    public void print () {
        System.out.println("h= " + this.hours + "m= " + this.minutes + "s= " + this.seconds);
    }
}

