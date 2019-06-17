package com.threadCommunication.communication.p_c_allWait;

public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    System.out.println("消费者" + Thread.currentThread().getName() + "WAITING");
                    lock.wait();
                }
                System.out.println("消费者" + Thread.currentThread().getName() + "RUNNABLE");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
