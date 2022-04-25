package com.zhongdone.pattern.creational.factory.abstractFactory.desktop;

import com.zhongdone.pattern.creational.factory.abstractFactory.desktop.DesktopComputer;

/**
 * 华为台式机
 */
public class HuaweiDesktopComputer extends DesktopComputer {
    /**
     * 开机
     */
    public void powerOn() {
        System.out.println("华为台式电脑开机!");
    }

    /**
     * 关机
     */
    public void powerOff() {
        System.out.println("华为台式电脑关机!");
    }
}
