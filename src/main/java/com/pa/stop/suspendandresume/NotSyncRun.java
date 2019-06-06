package com.pa.stop.suspendandresume;

public class NotSyncRun {

    public static void main(String[] args) throws InterruptedException {
       final NotSyncObject object=new NotSyncObject();
       Thread thread1=new Thread(){
           @Override
           public void run() {
               object.setValue("b","bb");
           }
       };
       thread1.setName("b");
       thread1.start();
       Thread.sleep(500);

       Thread thread2=new Thread(){
           @Override
           public void run() {
               object.printUsernameAndPassword();
           }
       };
       thread2.start();
    }
}
