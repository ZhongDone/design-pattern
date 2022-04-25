package com.zhongdone.pattern.creational.builder;

/**
 * 调用者
 */
public class Director {

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        concreteBuilder.addName("华为笔记本电脑")
                .addType("电脑")
                .addDetail("轻薄办公本")
                .addImgUrl("http://xxxxxxxxxx");

        System.out.println(concreteBuilder.getProduct());
    }

}
