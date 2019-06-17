package com.useTimer.taskLater;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {
    public void run() {
        try {
            System.out.println("A begin time="+new Date());
            Thread.sleep(20000);
            System.out.println("A end time="+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
