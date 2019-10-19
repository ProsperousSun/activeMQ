package com.factory.simpleFactory;

import com.factory.ICourse;

public class CourseFactory {
    // 还可以根据传入的 String 来创建不同的对象 等等方式
    //根据传入的参数 创建不同的对象
    public ICourse createSimpleFactory(Class clazz) {
        if (clazz != null) {
            try {
                return (ICourse)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
