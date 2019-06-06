package com.safe.t1;

public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum num=new HasSelfPrivateNum();

        Thread1 thread1=new Thread1(num);
        thread1.start();
        Thread2 thread2=new Thread2(num);
        thread2.start();
    }
}
