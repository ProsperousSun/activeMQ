package com.factory;

public class JavaCourse implements ICourse {

    @Override
    public void direct() {
        System.out.println("Java 直播方式！");
    }
}
