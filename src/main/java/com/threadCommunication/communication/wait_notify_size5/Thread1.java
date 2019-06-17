package com.threadCommunication.communication.wait_notify_size5;

public class Thread1 extends Thread {
    private Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin=" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end=" + System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
