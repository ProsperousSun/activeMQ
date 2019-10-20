package com.singleFactory.hungrySingle;


/**
 * 好处  能够实现实现安全
 *
 * 坏处 不需要的时候也加载，浪费资源
 */
public class HungrySingle {

    private static final HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){

    }

    public static HungrySingle getHungrySingle() {
        return hungrySingle;
    }

}
