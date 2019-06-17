package com.threadCommunication.join.joinMoreTest;

public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin b threadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end b threadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
