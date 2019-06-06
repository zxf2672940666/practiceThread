package com.pa.daemon;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象不在打印了，也就停止了!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
