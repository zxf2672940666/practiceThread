package com.pa;
/*
* 代码的运行结果与代码执行顺序或调用顺序是无关的
* */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
//        System.out.println("运行开始");
//        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<10;i++){
            int time= (int) (Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("run=" +Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
