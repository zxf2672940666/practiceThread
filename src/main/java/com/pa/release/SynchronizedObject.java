package com.pa.release;

public class SynchronizedObject {
    private String username="a";
    private String password="aa";

    public synchronized void printString(String username,String password){
        try {
            this.username=username;
            Thread.sleep(2000);
            this.password=password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
