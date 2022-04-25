package com.zhongdone.pattern.creational.singleton;

/**
 * 枚举单例（可用）属于懒加载
 */
public enum Singleton8 {

    INSTANCE{
        protected void printTest(){
            System.out.println("print test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton8 getInstance(){
        return INSTANCE;
    }

}
