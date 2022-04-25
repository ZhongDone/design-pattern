package com.zhongdone.pattern.creational.factory.abstractFactory;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 测试抽象工厂
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractComputerFactory huaweiComputerFactory = new HuaweiComputerFactory();
        Computer desktopComputer = huaweiComputerFactory.createDesktopComputer();
        desktopComputer.powerOn();
        desktopComputer.powerOff();
        Computer noteBookComputer = huaweiComputerFactory.createNoteBookComputer();
        noteBookComputer.powerOn();
        noteBookComputer.powerOff();

        AbstractComputerFactory XiaomiComputerFactory = new XiaomiComputerFactory();
        Computer desktopComputer1 = XiaomiComputerFactory.createDesktopComputer();
        desktopComputer1.powerOn();
        desktopComputer1.powerOff();
        Computer noteBookComputer1 = XiaomiComputerFactory.createNoteBookComputer();
        noteBookComputer1.powerOn();
        noteBookComputer1.powerOff();
    }
}
