package com.useTimer.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run4 {

    public static class MyTask extends TimerTask {

        public void run() {
            try {
                System.out.println("begin timer=" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end timer=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask myTask=new MyTask();
        System.out.println("当前时间"+System.currentTimeMillis());
        Timer timer=new Timer();
        timer.schedule(myTask,3000,2000);
    }
}
