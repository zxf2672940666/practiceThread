package com.useLock.useReentrantLock.ConditionTestManyToMany;


public class Run {

    public static void main(String[] args) {
        Service service=new Service();

        Thread1 [] thread1=new Thread1[10];
        Thread2 [] thread2=new Thread2[10];
        for (int i=0;i<10;i++){
            thread1[i]=new Thread1(service);
            thread2[i]=new Thread2(service);
            thread1[i].start();
            thread2[i].start();
        }
    }
}
