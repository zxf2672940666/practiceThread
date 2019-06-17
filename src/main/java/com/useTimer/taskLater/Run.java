package com.useTimer.taskLater;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar1.getTime();
        System.out.println("A计划时间：" + date1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND, 10);
        Date date2 = calendar2.getTime();
        System.out.println("B计划时间：" + date2);

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Timer timer = new Timer();
        timer.schedule(task1, date1);
        timer.schedule(task2, date2);


    }
}
