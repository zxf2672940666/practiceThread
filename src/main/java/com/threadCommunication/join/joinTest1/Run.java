package com.threadCommunication.join.joinTest1;


public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("我想当threadtest对象执行完毕后我在执行");
        System.out.println("但上面的代码中sleep中的值应该写多少呢");
        System.out.println("答案是：根据不能确定：");
    }
}
