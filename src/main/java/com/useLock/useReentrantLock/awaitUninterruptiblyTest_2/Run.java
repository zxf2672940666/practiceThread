package com.useLock.useReentrantLock.awaitUninterruptiblyTest_2;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.testMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(3000);
        System.out.println("三秒后");
        thread.interrupt();
    }
}
