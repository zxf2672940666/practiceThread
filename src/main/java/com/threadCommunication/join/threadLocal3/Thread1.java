package com.threadCommunication.join.threadLocal3;

public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在thread1线程中取值=" + Tools.threadLocal.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
