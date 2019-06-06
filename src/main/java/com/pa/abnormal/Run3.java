package com.pa.abnormal;

public class Run3 {

    public static void main(String[] args) {
        MyThread3 thread3=new MyThread3();
        thread3.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.stop();
    }
}
