package com.useTimer.TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Run {

    public static void main(String[] args) {
        int i = 0;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        while (true) {
            i++;
            Timer timer = new Timer();
            Task1 task1 = new Task1(i);
            timer.schedule(task1, date);
            timer.cancel();

        }
    }
}
