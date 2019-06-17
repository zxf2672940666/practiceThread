package com.threadCommunication.communication.twoThreadTransData;

public class Thread2 extends Thread {

    private MyList myList;

    public Thread2(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (myList.size() == 5) {
                    System.out.println("==5 了  ，线程b要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
