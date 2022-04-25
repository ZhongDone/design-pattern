package com.zhongdone.pattern.creational.factory.abstractFactory.notebook;

import com.zhongdone.pattern.creational.factory.abstractFactory.notebook.NoteBookComputer;

/**
 * 小米笔记本
 */
public class XiaomiNoteBookComputer extends NoteBookComputer {
    /**
     * 开机
     */
    public void powerOn() {
        System.out.println("华为笔记本电脑开机!");
    }

    /**
     * 关机
     */
    public void powerOff() {
        System.out.println("华为笔记本电脑关机!");
    }
}
