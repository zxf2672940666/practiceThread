package com.safe.wrong.syncStaticMethod;

public class Thread1 extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
