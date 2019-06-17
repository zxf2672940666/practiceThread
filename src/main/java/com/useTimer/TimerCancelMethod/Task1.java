package com.useTimer.TimerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {
    public void run() {
        System.out.println("A run timer=" + new Date());
    }
}
