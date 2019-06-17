package com.useTimer.TimerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class Task2 extends TimerTask {
    public void run() {
        System.out.println("B run timer=" + new Date());
    }
}
