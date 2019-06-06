package com.pa.abnormal;

public class MyThread4 extends Thread {

    @Override
    public void run() {
        try {
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入catch方法");
            e.printStackTrace();
        }
    }
}
