package com.safe.wrong.twoStop;

import javafx.beans.binding.ObjectExpression;

public class Service {
    Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("metodA end");
        }
    }

    Object object2 = new Object();

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
