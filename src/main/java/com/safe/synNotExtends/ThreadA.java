package com.safe.synNotExtends;

public class ThreadA extends Thread {

    private Sub sub;

    public ThreadA(Sub sub){
        this.sub=sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
