package com.safe.keywordVolatile.synchronizedUpdateNewYork;

public class Run {

    public static void main(String[] args) {
        try {
            Service service=new Service();
            Thread1 thread1=new Thread1(service);
            thread1.start();

            Thread.sleep(1000);

            Thread2 thread2=new Thread2(service);
            thread2.start();
            System.out.println("已经发起停止命令");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
