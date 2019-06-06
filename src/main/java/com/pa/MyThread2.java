package com.pa;

public class MyThread2 extends Thread {

    private int count=5;

    public MyThread2(String name){
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);

    }

    public static void main(String[] args) {
        MyThread2 A=new MyThread2("A");
        MyThread2 B=new MyThread2("B");
        MyThread2 C=new MyThread2("C");
        A.start();
        B.start();
        C.start();
    }
}
