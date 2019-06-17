package com.threadCommunication.communication.pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {

    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
