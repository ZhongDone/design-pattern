package com.zhongdone.pattern.creational.factory.factoryMethod;

import com.zhongdone.pattern.creational.factory.Computer;
import com.zhongdone.pattern.creational.factory.simpleFactory.HuaweiComputer;

public class XiaomiComputerFactory implements ComputerFactory {

    public Computer createComputer() {
        return new HuaweiComputer();
    }
}
