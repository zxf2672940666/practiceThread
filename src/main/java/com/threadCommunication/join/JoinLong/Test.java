package com.threadCommunication.join.JoinLong;

public class Test {

    public static void main(String[] args) {
        try {
            Thread1 thread1 = new Thread1();
            thread1.start();
            thread1.join(2000);
            System.out.println("end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
