package com.singleFactory.enumSingle;

import java.lang.reflect.Constructor;

public class EnumSingleRefletTest {

    public static void main(String[] args) {

        try {
            Class clazz = EnumSingle.class;
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            //从这里进去看 源码
            //  if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            //            throw new IllegalArgumentException("Cannot reflectively create enum objects");
            // 从这里可以看出从 jdk层面上我们就 已经限制了这个 枚举不能够进行发射

            //所以说 枚举 是天然的 单例模式
            Object o = constructor.newInstance();
            System.out.println(o);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
