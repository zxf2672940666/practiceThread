package com.safe.wrong.t8;

public class Thread2 extends Thread {
    private Task task;

    public Thread2(Task task){
        this.task=task;
    }
    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
