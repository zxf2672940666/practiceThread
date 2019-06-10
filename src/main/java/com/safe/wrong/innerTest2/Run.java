package com.safe.wrong.innerTest2;

import com.safe.wrong.test1.Thread2;

public class Run {

    public static void main(String[] args) {
        final OutClass.InnerClass1 innerClass1=new OutClass.InnerClass1();
        final OutClass.InnerClass2 innerClass2=new OutClass.InnerClass2();

        Thread thread1=new Thread(new Runnable() {
            public void run() {
                innerClass1.method1(innerClass2);
            }
        },"T1");

        Thread thread2=new Thread(new Runnable() {
            public void run() {
                innerClass1.method2();
            }
        },"T2");

        Thread thread3=new Thread(new Runnable() {
            public void run() {
                innerClass2.method1();
            }
        },"T3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
