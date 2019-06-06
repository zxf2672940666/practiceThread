package com.safe.synNotExtends;

public class Test {

    public static void main(String[] args) {
        Sub sub=new Sub();
        ThreadA threadA=new ThreadA(sub);
        threadA.setName("A");
        threadA.start();

        ThreadB b=new ThreadB(sub);
        b.setName("B");
        b.start();
    }
}
