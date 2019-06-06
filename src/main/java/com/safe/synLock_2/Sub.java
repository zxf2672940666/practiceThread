package com.safe.synLock_2;

public class Sub extends Main {
    private int i=10;
    public synchronized void operateSubMethod() {
        try {
            while (i>0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
