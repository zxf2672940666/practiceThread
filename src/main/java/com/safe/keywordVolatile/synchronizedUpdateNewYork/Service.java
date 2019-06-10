package com.safe.keywordVolatile.synchronizedUpdateNewYork;

public class Service {
    private boolean isContinueRun=true;

    public void runMethod(){
        String anything=new String();
        while (isContinueRun==true){
            synchronized (anything){
            }
        }
        System.out.println("停下来了");
    }
    public void stopMethod(){
        isContinueRun=false;
    }
}
