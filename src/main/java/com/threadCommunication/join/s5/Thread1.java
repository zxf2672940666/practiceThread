package com.threadCommunication.join.s5;

import java.util.Date;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.threadLocal.get() == null) {
                    Tools.threadLocal.set(new Date());
                }
                System.out.println("1:" + Tools.threadLocal.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
