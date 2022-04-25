package com.zhongdone.pattern.creational.factory.abstractFactory;

import com.zhongdone.pattern.creational.factory.Computer;

/**
 * 抽象工厂
 */
public abstract class AbstractComputerFactory {
    /**
     * 创建台式电脑
     */
    public abstract Computer createDesktopComputer();

    /**
     * 创建笔记本电脑
     */
    public abstract Computer createNoteBookComputer();
}
