package com.threadCommunication.communication.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

    public void readMethod(PipedInputStream inputStream) {
        try {
            System.out.println("read:");
            byte[] bytes = new byte[20];
            int readLength = inputStream.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.println(newData);
                readLength = inputStream.read(bytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
