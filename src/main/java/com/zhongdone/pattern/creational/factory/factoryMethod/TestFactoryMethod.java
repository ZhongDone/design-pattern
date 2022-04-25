package com.zhongdone.pattern.creational.factory.factoryMethod;

import com.zhongdone.pattern.creational.factory.Computer;

public class TestFactoryMethod {

    public static void main(String[] args) {
        ComputerFactory huaweiComputerFactory = new HuaweiComputerFactory();
        Computer huaweiComputer = huaweiComputerFactory.createComputer();
        huaweiComputer.powerOn();
        huaweiComputer.powerOff();

        ComputerFactory xiaomiComputerFactory = new XiaomiComputerFactory();
        Computer xiaomiComputer = xiaomiComputerFactory.createComputer();
        xiaomiComputer.powerOn();
        xiaomiComputer.powerOff();

    }

}
