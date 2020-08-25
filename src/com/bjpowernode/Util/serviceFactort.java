package com.bjpowernode.Util;

import java.util.concurrent.TransferQueue;

public class serviceFactort {
    public static Object getService(Object service){
        return new transacationinvocationhandler(service).getproxy();

    }
}
