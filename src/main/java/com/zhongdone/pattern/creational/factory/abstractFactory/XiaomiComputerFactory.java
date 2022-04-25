package com.zhongdone.pattern.creational.factory.abstractFactory;

import com.zhongdone.pattern.creational.factory.Computer;
import com.zhongdone.pattern.creational.factory.abstractFactory.desktop.HuaweiDesktopComputer;
import com.zhongdone.pattern.creational.factory.abstractFactory.desktop.XiaomiDesktopComputer;
import com.zhongdone.pattern.creational.factory.abstractFactory.notebook.HuaweiNoteBookComputer;
import com.zhongdone.pattern.creational.factory.abstractFactory.notebook.XiaomiNoteBookComputer;

/**
 * 小米工厂
 */
public class XiaomiComputerFactory extends AbstractComputerFactory {
    /**
     * 创建台式电脑
     * @return
     */
    public Computer createDesktopComputer() {
        return new XiaomiDesktopComputer();
    }
    /**
     * 创建笔记本电脑
     * @return
     */
    public Computer createNoteBookComputer() {
        return new XiaomiNoteBookComputer();
    }
}
