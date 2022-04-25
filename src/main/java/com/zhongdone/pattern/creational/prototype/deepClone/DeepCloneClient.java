package com.zhongdone.pattern.creational.prototype.deepClone;

import com.zhongdone.pattern.creational.prototype.jdk.JDKConcretePrototype;

import java.util.ArrayList;
import java.util.List;

public class DeepCloneClient {
    public static void main(String[] args) {
        DeepCloneConcretePrototype concretePrototype = new DeepCloneConcretePrototype();
        concretePrototype.setName("张三");
        concretePrototype.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("打篮球");
        hobbies.add("踢足球");
        concretePrototype.setHobbies(hobbies);


        DeepCloneConcretePrototype clone = concretePrototype.deepClone();

        System.out.println(concretePrototype);
        System.out.println(clone);

        List<String> hobbies1 = clone.getHobbies();
        hobbies1.add("游泳");

        System.out.println(concretePrototype.getHobbies());
        System.out.println(clone.getHobbies());

    }
}
