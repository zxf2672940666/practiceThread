package com.threadCommunication.communication.stack_1;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List list = new ArrayList();

    public synchronized void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add(Math.random());
            this.notifyAll();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + "WAITING");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
