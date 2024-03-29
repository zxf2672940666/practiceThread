package com.threadCommunication.communication.twoThreadTransData;

public class Thread1 extends Thread {

    private MyList myList;

    public Thread1(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                myList.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
