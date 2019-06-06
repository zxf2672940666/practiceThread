package com.pa;

public class Test extends Thread{

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setName("myThread");
        myThread.start();
        for (int i=0;i<10;i++){
            int time= (int) (Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
