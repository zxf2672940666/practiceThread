package com.safe.dirtyread;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVar=new PublicVar();
            Thread1 thread1=new Thread1(publicVar);
            thread1.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
