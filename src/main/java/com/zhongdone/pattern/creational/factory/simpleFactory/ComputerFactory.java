package com.zhongdone.pattern.creational.factory.simpleFactory;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 电脑工厂
 */
public class ComputerFactory {

    public Computer create(String type){
        if (type == null || type.length() == 0){
            return null;
        }
        if ("Huawei".equalsIgnoreCase(type)) {
            return new HuaweiComputer();
        } else if ("Xiaomi".equalsIgnoreCase(type)) {
            return new XiaomiComputer();
        }
        return null;
    }

}
