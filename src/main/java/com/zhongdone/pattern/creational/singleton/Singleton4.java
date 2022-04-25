package com.zhongdone.pattern.creational.singleton;

/**
 * 懒汉式（线程安全）
 */
public class Singleton4 {

    private static Singleton4 INSTANCE;

    private Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }

}
