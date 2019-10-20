package com.singleFactory.enumSingle;

public class InnerSingleForEnum {

    private InnerSingleForEnum() {

        /**
         * 阻止了 反射获取单例模式
         */
        if (InnerClassSingle.INNERSINGLE != null) {
            throw new RuntimeException("不允许反射创建对象");
        }
    }


    private static class InnerClassSingle {
        private static InnerSingleForEnum INNERSINGLE = new InnerSingleForEnum();
    }

    public static final InnerSingleForEnum getInstance() {
        return InnerClassSingle.INNERSINGLE;
    }

    /**
     * 巧妙地运用了内部类的执行 过程，
     * 可以称之为 性能最优秀的
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(InnerSingleForEnum.getInstance());
    }
}
