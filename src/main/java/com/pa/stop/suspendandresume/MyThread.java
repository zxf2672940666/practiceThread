package com.pa.stop.suspendandresume;
/*
* suspend和resume方法是容易长生因为线程的暂停而导致数据不同步的情况
*
* */
public class MyThread extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}
