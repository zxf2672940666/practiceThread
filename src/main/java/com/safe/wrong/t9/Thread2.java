package com.safe.wrong.t9;

public class Thread2 extends Thread {
    private MyOneList list;

    public Thread2(MyOneList list){
        this.list=list;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.addServiceMethod(list,"B");
    }
}
