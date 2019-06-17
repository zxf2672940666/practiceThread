package com.useTimer.taskLater;

import java.util.Date;
import java.util.TimerTask;

public class Task2 extends TimerTask {
    public void run() {
        System.out.println("B begin time=" + new Date());
        System.out.println("B end time=" + new Date());
    }
}
