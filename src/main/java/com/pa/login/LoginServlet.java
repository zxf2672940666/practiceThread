package com.pa.login;

public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public synchronized static void doPost(String username,String password){
        try {
            usernameRef=username;
            passwordRef=password;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            System.out.println("username="+usernameRef+","+"password="+passwordRef);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
