package com.safe.keywordVolatile.t16;

public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void run() {
        System.out.println("进入run");
        while (isRunning == true) {

        }
        System.out.println("线程被停止了");
    }
}
