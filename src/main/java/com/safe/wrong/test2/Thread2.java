package com.safe.wrong.test2;

public class Thread2 extends Thread {

    private MyObject object;

    public Thread2(MyObject object){
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
