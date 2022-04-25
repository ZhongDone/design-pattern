package com.zhongdone.pattern.creational.factory.abstractFactory;

import com.zhongdone.pattern.creational.factory.Computer;
import com.zhongdone.pattern.creational.factory.abstractFactory.desktop.HuaweiDesktopComputer;
import com.zhongdone.pattern.creational.factory.abstractFactory.notebook.HuaweiNoteBookComputer;

/**
 * 华为工厂
 */
public class HuaweiComputerFactory extends AbstractComputerFactory {
    /**
     * 创建台式电脑
     * @return
     */
    public Computer createDesktopComputer() {
        return new HuaweiDesktopComputer();
    }

    /**
     * 创建笔记本电脑
     * @return
     */
    public Computer createNoteBookComputer() {
        return new HuaweiNoteBookComputer();
    }
}
