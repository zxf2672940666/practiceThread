package com.safe.wrong.syn_out_asyn;

public class Thread2 extends Thread {
    private MyList myList;

    public Thread2(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            myList.add("thread2" + (i + 1));
        }
    }
}
