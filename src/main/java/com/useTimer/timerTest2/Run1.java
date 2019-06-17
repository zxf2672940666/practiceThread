package com.useTimer.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run1 {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);
        Date date = calendar.getTime();
        System.out.println("计划时间："+date);
        MyTask myTask = new MyTask();
        Timer timer = new Timer(true);//守护线程
        timer.schedule(myTask, date);
    }
}
