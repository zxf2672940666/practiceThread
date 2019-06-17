package com.threadCommunication.join.threadLocal3;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
