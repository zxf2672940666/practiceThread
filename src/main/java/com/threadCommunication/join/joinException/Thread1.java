package com.threadCommunication.join.joinException;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
