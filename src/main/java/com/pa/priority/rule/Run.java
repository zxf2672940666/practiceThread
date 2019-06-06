package com.pa.priority.rule;
/*
* 不要把线程的优先级顺序和循行结果顺序作为衡量的标准，
* 优先级高的不一定每一次都先执行完毕，也就是说线程的优先级和打印顺序无关
* 不要将这两者的关系相关联，他们的关系具有不确定性和随机性
* */
public class Run {

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            Thread1 thread1=new Thread1();
            thread1.setPriority(1);
            thread1.start();
            Thread2 thread2=new Thread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
