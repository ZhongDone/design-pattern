package com.zhongdone.pattern.creational.factory.abstractFactory.desktop;

import com.zhongdone.pattern.creational.factory.abstractFactory.desktop.DesktopComputer;

/**
 * 小米台式机
 */
public class XiaomiDesktopComputer extends DesktopComputer {
    /**
     * 开机
     */
    public void powerOn() {
        System.out.println("小米台式电脑开机!");
    }

    /**
     * 关机
     */
    public void powerOff() {
        System.out.println("小米台式电脑关机!");
    }
}
