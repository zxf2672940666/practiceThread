package com.threadCommunication.join.joinException;

public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread1 thread1=new Thread1();
            thread1.start();
            thread1.join();
            System.out.println("线程b在run  end出打印了");
        }catch (InterruptedException e){
            System.out.println("线程b在catch出打印了");
            e.printStackTrace();
        }
    }
}
