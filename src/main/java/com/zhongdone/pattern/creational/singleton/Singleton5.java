package com.zhongdone.pattern.creational.singleton;

/**
 * 懒汉式（线程不安全）（不推荐）
* 多个线程同时进入 if(INSTANCE == null){里就会出现多次创建实例
 */
public class Singleton5 {

    private static Singleton5 INSTANCE;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if(INSTANCE == null){
            synchronized(Singleton5.class){
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }

}
