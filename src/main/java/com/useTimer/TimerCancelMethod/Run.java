package com.useTimer.TimerCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        System.out.println("计划时间为：" + date);
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Timer timer = new Timer();
        timer.schedule(task1, date, 2000);
        timer.schedule(task2, date, 2000);

        Thread.sleep(20000);
        timer.cancel();
    }
}
