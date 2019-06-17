package com.useTimer.TimerTaskCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Timer timer = new Timer();
        timer.schedule(task1, date, 4000);
        timer.schedule(task2, date, 4000);
    }
}
