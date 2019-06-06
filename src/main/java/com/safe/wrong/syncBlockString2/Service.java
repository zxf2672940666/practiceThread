package com.safe.wrong.syncBlockString2;

public class Service {

    private String anything=new String();

    public void a(){
        try {
            synchronized (anything){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized  void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
