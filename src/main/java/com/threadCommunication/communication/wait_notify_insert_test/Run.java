package com.threadCommunication.communication.wait_notify_insert_test;

public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();

        for (int i = 0; i < 20; i++) {
            BackupA backupA = new BackupA(dbTools);
            backupA.start();
            BackupB backupB = new BackupB(dbTools);
            backupB.start();
        }
    }
}
