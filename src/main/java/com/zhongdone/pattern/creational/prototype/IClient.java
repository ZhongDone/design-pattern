package com.zhongdone.pattern.creational.prototype;

public class IClient {

    public static void main(String[] args) {
        IConcretePrototype iConcretePrototype = new IConcretePrototype();
        iConcretePrototype.setName("张三");
        iConcretePrototype.setAge(18);

        IConcretePrototype clone = iConcretePrototype.clone();

        System.out.println(iConcretePrototype);
        System.out.println(clone);
    }

}
