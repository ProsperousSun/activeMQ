package com.singleFactory.lazySingle;

public class ExcutorThread implements Runnable{
    @Override
    public void run() {
        LazySingle instance3 = LazySingle.getInstance3();
        System.out.println(Thread.currentThread()+":"+instance3);
    }
}
