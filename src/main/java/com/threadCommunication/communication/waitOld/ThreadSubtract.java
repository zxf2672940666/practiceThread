package com.threadCommunication.communication.waitOld;


public class ThreadSubtract extends Thread {
    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
