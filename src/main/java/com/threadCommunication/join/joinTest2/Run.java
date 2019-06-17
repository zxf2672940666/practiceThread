package com.threadCommunication.join.joinTest2;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("我想当myThread对象执行完毕后在执行，我做到了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
