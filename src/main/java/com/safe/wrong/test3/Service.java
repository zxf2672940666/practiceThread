package com.safe.wrong.test3;

public class Service {

    public void testMethod(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod_getLock time"+System.currentTimeMillis()+"" +
                        " run ThreadName="+Thread.currentThread().getName() );
                Thread.sleep(5000);
                System.out.println("testMethod_releaseLock time"+System.currentTimeMillis()+" " +
                        "run ThreadName="+Thread.currentThread().getName() );
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
