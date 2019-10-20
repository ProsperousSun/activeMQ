package com.singleFactory.serailSingle;

import java.io.Serializable;

public class SerialSingle implements Serializable {

    public static final SerialSingle serialSingle = new SerialSingle();

    private SerialSingle() {

    }

    /**
     * 反序列化 不被破环的关键
     * @return
     *
     * 重写这个方法 只不过是反序列化出来的对象被 反射的对象代替了
     * 只不过是在 jvM层面是 进行了两次对象的创建，最终返回的 反射的出来的
     * 之前被被序列化的 被GC回收掉了
     */
    public Object readResolve() {
        return serialSingle;
    }
}
