package com.threadCommunication.communication.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public void add() {
        list.add("zxf");
    }

    public int size() {
        return list.size();
    }
}
