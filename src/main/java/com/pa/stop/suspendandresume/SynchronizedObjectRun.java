package com.pa.stop.suspendandresume;

public class SynchronizedObjectRun {

    public static void main(String[] args) {
        try {
            final SynchronizedObject object=new SynchronizedObject();
            Thread1 thread1=new Thread1();
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread2 thread2=new Thread2();
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
