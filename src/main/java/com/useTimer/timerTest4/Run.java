package com.useTimer.timerTest4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

    public static class MyTask extends TimerTask{

        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        System.out.println("当前时间为："+new Date());
        timer.schedule(myTask,3000,5000);
    }
}
