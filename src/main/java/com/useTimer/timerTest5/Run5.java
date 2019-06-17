package com.useTimer.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run5 {

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
        Calendar calendar= Calendar.getInstance();
        Date date=calendar.getTime();
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(myTask,date,2000);
    }
}
