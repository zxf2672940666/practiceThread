package com.pa.abnormal;

public class Run2 {

    public static void main(String[] args) {
        MyThread2 thread2=new MyThread2();
        thread2.start();
        thread2.interrupt();
        System.out.println("end");
    }
}
