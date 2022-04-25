package com.zhongdone.pattern.creational.factory.abstractFactory.notebook;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 笔记本
 */
public abstract class NoteBookComputer implements Computer {
    /**
     * 开机
     */
    public abstract void powerOn();

    /**
     * 关机
     */
    public abstract void powerOff();
}
