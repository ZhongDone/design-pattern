package com.zhongdone.pattern.creational.prototype.jdk;

import com.zhongdone.pattern.creational.prototype.IPrototype;

import java.util.List;

public class JDKConcretePrototype implements Cloneable {

    private String name;

    private Integer age;

    private List<String> hobbies;

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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public JDKConcretePrototype clone() {
        try {
            return (JDKConcretePrototype)super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
