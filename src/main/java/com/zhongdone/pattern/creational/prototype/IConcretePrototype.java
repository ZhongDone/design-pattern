package com.zhongdone.pattern.creational.prototype;

public class IConcretePrototype implements IPrototype<IConcretePrototype> {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public IConcretePrototype clone() {
        IConcretePrototype concretePrototype = new IConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
