package com.useLock.useReentrantLock.tryLock_param;

public class Run {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMthod();
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.setName("A");
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.setName("B");
        thread2.start();
    }
}
