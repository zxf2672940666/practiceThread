package com.useTimer.timerTest2_period;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    public void run() {
        System.out.println("任务执行了，时间为" + System.currentTimeMillis());
    }
}
