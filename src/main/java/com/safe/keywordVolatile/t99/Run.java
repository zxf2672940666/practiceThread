package com.safe.keywordVolatile.t99;

public class Run {

    public static void main(String[] args) {
        PrintString printString=new PrintString();
        printString.printStringMethod();
        System.out.println("我要暂停它"+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
