package com.threadCommunication.communication.firstNotify;

public class MyRun {
    private static String lock = new String("");
    private static boolean isFirstRunB = false;
    private static Runnable runnable1 = new Runnable() {
        public void run() {
            try {
//                synchronized (lock) {
//                    System.out.println("begin wait");
//                    lock.wait();
//                    System.out.println("end wait");
//                }
                synchronized (lock) {
                    while (isFirstRunB == false) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB=true;
            }

        }
    };

    public static void main(String[] args) throws InterruptedException {
//        Thread thread2 = new Thread(runnable2);
//        thread2.start();
//        Thread.sleep(3000);
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread.sleep(3000);
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
