package com.threadCommunication.communication.stack_1;

public class Run {

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        P p=new P(myStack);
        C c=new C(myStack);

        Thread1 thread1=new Thread1(p);
        Thread2 thread2=new Thread2(c);

        thread2.start();
        thread1.start();

    }
}
