package com.pa.priority.rule;

import java.util.Random;

public class Thread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 5000000; i++) {
            Random random = new Random();
            random.nextInt();
            addResult = addResult + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time=" + (endTime - beginTime)+","+addResult);
    }
}
