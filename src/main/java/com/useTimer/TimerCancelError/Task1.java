package com.useTimer.TimerCancelError;

import java.util.TimerTask;

public class Task1 extends TimerTask {
    private int i;

    public Task1(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("第" + i + "次没有被cancel取消");
    }
}
