package com.threadCommunication.join.joinMoreTest;

public class Thread1 extends Thread {

    private Thread2 thread2;

    public Thread1(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        try {
            synchronized (thread2) {
                System.out.println("begin a threadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end a threadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
