package com.singleFactory.lazySingle;

public class LazySingle {


    public static LazySingle lazySingle = null;

    private LazySingle(){

    }

    /**
     * 这样 能够实现用到的时候进行加载，但是不好，
     * 调用一次方法就会被 new 一个对象出来
     * @return
     */
    public static final LazySingle getInstance1(){
        return new LazySingle();
    }

    /**
     * 这样能够实现 获取的对象是单例的
     * 但是 纵然在jdk1.6之后，已经 对sychronized 进行改造，
     * 但是对于 这种synchronized 锁住 static 方法，是一种类锁，运行太慢
     * 开始进化
     * @return
     */
    public synchronized static final LazySingle getInstance2() {  //线程多的时候会响应性能
        if (null == lazySingle) {
            return new LazySingle();
        }
        return lazySingle;
    }

    /**
     * 这种 就在实现双重检查了
     * 但是 在内部的 sychronized 依旧可能会有多个线程 ，
     * @return
     */
    public static final LazySingle getInstance3() {
        if (null == lazySingle) {
            synchronized (LazySingle.class) {  //这里会有多个线程同时等待的可能
                return new LazySingle();
            }
        }
        return lazySingle;
    }

    /**
     * 双重检查机制
     * @return
     */
    public static final LazySingle getInstance4() {
        if (null == lazySingle) {
            synchronized (LazySingle.class) {
                if (null == lazySingle) {
                    return new LazySingle();
                }
            }
        }

        return lazySingle;
    }

    public static void main(String[] args) {
        System.out.println(getInstance1());
    }
}
