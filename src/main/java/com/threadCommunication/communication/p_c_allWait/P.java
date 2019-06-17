package com.threadCommunication.communication.p_c_allWait;

public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + "WAITING");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "RUNNABLE");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
