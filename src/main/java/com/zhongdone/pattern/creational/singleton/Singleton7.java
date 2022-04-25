package com.zhongdone.pattern.creational.singleton;

/**
 * 静态内部内方式（可用）
 */
public class Singleton7 {

    private Singleton7() {}

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }

    //这个内部类和里面的INSTANCE都是静态的，JVM类加载时就保证了唯一性
    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

}
