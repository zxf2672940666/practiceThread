package com.safe.keywordVolatile.atomicIntergerNoSafe;

public class Run {

    public static void main(String[] args) {
        try {
            MyService myService=new MyService();
            MyThread [] myThreads=new MyThread[5];
            for (int i=0;i<myThreads.length;i++){
                myThreads[i]=new MyThread(myService);
            }
            for (int i=0;i<myThreads.length;i++){
                myThreads[i].start();
            }
            Thread.sleep(1000);
            System.out.println(myService.atomicLong.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
