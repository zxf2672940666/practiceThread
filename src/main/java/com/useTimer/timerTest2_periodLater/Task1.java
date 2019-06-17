package com.useTimer.timerTest2_periodLater;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {
    public void run() {
        try {
            System.out.println("A begin timer="+new Date());
            Thread.sleep(5000);
            System.out.println("A end timer="+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
