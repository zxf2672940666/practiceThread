package com.threadCommunication.join.InheritableThreadLocal1;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println("在thread1线程中取值="+Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
