package com.pa.stop.suspendandresume;

public class NotSyncObject {
    private String username = "a";
    private String password = "aa";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("b")) {
            System.out.println("停止b线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernameAndPassword() {
        System.out.println("username =" + username + " , " + "password =" + password);
    }

}
