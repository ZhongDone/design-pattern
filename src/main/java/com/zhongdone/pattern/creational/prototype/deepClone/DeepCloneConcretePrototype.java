package com.zhongdone.pattern.creational.prototype.deepClone;

import com.zhongdone.pattern.creational.prototype.jdk.JDKConcretePrototype;

import java.io.*;
import java.util.List;

public class DeepCloneConcretePrototype implements Cloneable, Serializable {
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
    public DeepCloneConcretePrototype clone() {
        try {
            return (DeepCloneConcretePrototype)super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public DeepCloneConcretePrototype deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (DeepCloneConcretePrototype) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
