package com.pa.sleep;

public class Run2 {

    public static void main(String[] args) {
        MyThread2 b=new MyThread2();
        System.out.println("begin="+System.currentTimeMillis());
        b.start();
        System.out.println("end="+System.currentTimeMillis());
    }
}
