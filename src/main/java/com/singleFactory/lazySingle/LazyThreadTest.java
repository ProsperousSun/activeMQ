package com.singleFactory.lazySingle;

public class LazyThreadTest {

    public static void main(String[] args) {

        Thread t1 =new Thread( new ExcutorThread());
        Thread t2 =new Thread( new ExcutorThread());


        t1.start();
        t2.start();

        /**
         * 这个打 断点可以 查看 每个线程之间的 运行情况
         * debug 如何查看线程情况学习
         */
        System.out.println(" lazy test end");


    }
}
