package com.useTimer.timerTest2_period;

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

        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask, date,4000);
    }
}
