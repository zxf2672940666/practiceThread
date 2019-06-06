package com.pa.sleep;

public class Run3 {

    public static void main(String[] args) {
        try {
            Thread.sleep(200);
            MyThread3 thread3=new MyThread3();
            thread3.start();
            thread3.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
