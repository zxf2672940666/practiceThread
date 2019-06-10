package com.safe.wrong.syncStaticMethod;

public class Thread2 extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
