package com.safe.dirtyread;

public class Thread1 extends Thread {
    private PublicVar publicVar;

    public Thread1(PublicVar publicVar){
        this.publicVar=publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("b","bb");
    }
}
