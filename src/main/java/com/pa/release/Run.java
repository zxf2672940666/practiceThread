package com.pa.release;

public class Run {

    public static void main(String[] args) {
        try {
            SynchronizedObject object=new SynchronizedObject();
            MyThread thread=new MyThread(object);
            thread.start();
            Thread.sleep(500);
//            stop释放锁会造成数据不一致性
            thread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
