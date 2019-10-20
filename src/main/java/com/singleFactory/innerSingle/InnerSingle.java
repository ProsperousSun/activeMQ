package com.singleFactory.innerSingle;

import com.singleFactory.lazySingle.LazySingle;

import java.lang.invoke.LambdaConversionException;

public class InnerSingle {

    private InnerSingle() {

        /**
         * 阻止了 反射获取单例模式
         */
        if (InnerClassSingle.innerSingle != null) {
            throw new RuntimeException("不允许反射创建对象");
        }
    }


    private static class InnerClassSingle {
        private static  InnerSingle innerSingle = new InnerSingle();
    }

    public static final InnerSingle getInstance() {
        return InnerClassSingle.innerSingle;
    }

    /**
     * 巧妙地运用了内部类的执行 过程，
     * 可以称之为 性能最优秀的
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(InnerSingle.getInstance());
    }
}
