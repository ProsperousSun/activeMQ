package com.singleFactory;

public class ThreadLocalSingle {

    public static ThreadLocal threadLocal = new ThreadLocal();


    public static void main(String[] args) {
        threadLocal.set("1");
        System.out.println(threadLocal.get());
    }

}
