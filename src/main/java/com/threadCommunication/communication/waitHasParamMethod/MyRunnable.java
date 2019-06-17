package com.threadCommunication.communication.waitHasParamMethod;

public class MyRunnable {
    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin time=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("end time=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify time=" + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable1);
        thread.start();
        Thread.sleep(3000);
        Thread thread2=new Thread(runnable2);
        thread2.start();
    }
}
