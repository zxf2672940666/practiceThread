package com.pa.sleep;

public class Run1 {

    public static void main(String[] args) {
        MyThread1 a=new MyThread1();
        System.out.println("begin="+System.currentTimeMillis());
        a.run();
        System.out.println("end="+System.currentTimeMillis());
    }
}
