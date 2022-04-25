package com.zhongdone.pattern.creational.factory.simpleFactory;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 华为电脑
 */
public class XiaomiComputer implements Computer {
    /**
     * 开机
     */
    public void powerOn() {
        System.out.println("小米电脑开机!");
    }

    /**
     * 关机
     */
    public void powerOff() {
        System.out.println("小米电脑关机!");
    }
}
