package com.safe.keywordVolatile.t16;

public class Run {

    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已赋值false ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
