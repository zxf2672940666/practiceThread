package com.pa.release;

public class MyThread extends Thread {

    private SynchronizedObject object;

    @Override
    public void run() {
        super.run();
        object.printString("b","bb");
    }

    public MyThread(SynchronizedObject object){
        super();
        this.object=object;
    }
}
