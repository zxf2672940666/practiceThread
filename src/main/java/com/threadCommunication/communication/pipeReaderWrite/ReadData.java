package com.threadCommunication.communication.pipeReaderWrite;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {

    public void readMethod(PipedReader input){
        try {
            System.out.println("read:");
            char [] chars=new char[20];
            int readLength=input.read(chars);
            while (readLength!=-1){
                String newData=new String(chars,0,readLength);
                System.out.print(newData);
                readLength=input.read(chars);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
