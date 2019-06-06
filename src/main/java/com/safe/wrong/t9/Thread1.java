package com.safe.wrong.t9;

public class Thread1 extends Thread {
    private MyOneList list;

    public Thread1(MyOneList list){
        this.list=list;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.addServiceMethod(list,"A");
    }
}
