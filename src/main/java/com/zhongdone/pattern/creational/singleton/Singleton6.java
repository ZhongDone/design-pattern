package com.zhongdone.pattern.creational.singleton;

/**
 * 双重检查（推荐面试使用）
 */
public class Singleton6 {

    private static Singleton6 INSTANCE;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(INSTANCE == null){
            synchronized(Singleton6.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }

}
