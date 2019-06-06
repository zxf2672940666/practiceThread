package com.safe.wrong.syn_out_asyn;

public class Thread1 extends Thread {
    private MyList myList;

    public Thread1(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            myList.add("thread1" + (i + 1));
        }
    }
}
