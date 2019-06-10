package com.safe.keywordVolatile.t99;

public class PrintString {

    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint=isContinuePrint;
    }
    public void printStringMethod(){
        try {
            while (isContinuePrint==true){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
