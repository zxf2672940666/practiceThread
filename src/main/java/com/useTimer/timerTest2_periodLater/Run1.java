package com.useTimer.timerTest2_periodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        System.out.println("计划时间：" + date);

       Task1 task1=new Task1();
        Timer timer = new Timer();
        timer.schedule(task1, date, 4000);
    }
}
