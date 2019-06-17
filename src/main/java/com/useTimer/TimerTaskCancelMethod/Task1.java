package com.useTimer.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {
    public void run() {
        System.out.println("A run timer=" + new Date());
        this.cancel();
        System.out.println("A 任务自己移除自己");
    }
}
