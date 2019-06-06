package com.pa.interrupt;

public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        try {
            MyThread b = new MyThread();
            b.start();
            Thread.sleep(1000);
            b.interrupt();
            System.out.println("是否停止1 ? =" + Thread.interrupted());
            System.out.println("是否停止2 ? =" + b.isInterrupted());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
