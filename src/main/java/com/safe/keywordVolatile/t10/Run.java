package com.safe.keywordVolatile.t10;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        PrintString printString=new PrintString();
        new Thread(printString).start();
        Thread.sleep(1000);
        System.out.println("我要暂停它: "+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
