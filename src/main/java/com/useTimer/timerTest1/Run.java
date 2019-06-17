package com.useTimer.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask, date);
    }
}
