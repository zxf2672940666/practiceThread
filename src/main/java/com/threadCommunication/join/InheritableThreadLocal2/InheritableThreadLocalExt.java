package com.threadCommunication.join.InheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我现在在子线程中";
    }
}
