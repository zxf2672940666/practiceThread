package com.safe.wrong.syncblockstring;

public class Service {
    private String usernameParam;
    private String passwordParam;

    public void setUsernamePassword(String username,String password){
        try {
            String anyString=new String();
            synchronized (anyString){
                System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步方法");
                usernameParam=username;
                passwordParam=password;
                Thread.sleep(3000);
                System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步方法");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
