package com.pa.stop.suspendandresume;

public class Thread1 extends Thread{
    private SynchronizedObject object=new SynchronizedObject();
    @Override
    public void run() {
        object.prinString();
    }
}
