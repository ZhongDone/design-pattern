package com.zhongdone.pattern.creational.factory.abstractFactory.desktop;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 台式机
 */
public abstract class DesktopComputer implements Computer {
    /**
     * 开机
     */
    public abstract void powerOn();

    /**
     * 关机
     */
    public abstract void powerOff();
}
