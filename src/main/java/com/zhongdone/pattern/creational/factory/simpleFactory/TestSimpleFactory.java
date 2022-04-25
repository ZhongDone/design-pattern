package com.zhongdone.pattern.creational.factory.simpleFactory;

import com.zhongdone.pattern.creational.factory.Computer;

public class TestSimpleFactory {

    public static void main(String[] args) {
        // 创建电脑工厂
        ComputerFactory computerFactory = new ComputerFactory();
        // 创建华为电脑
        Computer computer1 = computerFactory.create("Huawei");
        // 创建小米电脑
        Computer computer2 = computerFactory.create("Xiaomi");

        computer1.powerOn();
        computer1.powerOff();

        computer2.powerOn();
        computer2.powerOff();

    }
}
