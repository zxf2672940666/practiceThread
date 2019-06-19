package com.SingletonModeWithMultithreading.singleton_7_1;

import java.io.*;

public class SaveAndRead {

    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject = (MyObject) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
