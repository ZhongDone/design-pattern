package com.zhongdone.pattern.creational.prototype.jdk;

import com.zhongdone.pattern.creational.prototype.IConcretePrototype;

import java.util.ArrayList;
import java.util.List;

public class JDKClient {
    public static void main(String[] args) {
        JDKConcretePrototype jdkConcretePrototype = new JDKConcretePrototype();
        jdkConcretePrototype.setName("张三");
        jdkConcretePrototype.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("打篮球");
        hobbies.add("踢足球");
        jdkConcretePrototype.setHobbies(hobbies);
        JDKConcretePrototype clone = jdkConcretePrototype.clone();

        System.out.println(jdkConcretePrototype);
        System.out.println(clone);

        List<String> hobbies1 = clone.getHobbies();
        hobbies1.add("游泳");

        System.out.println(jdkConcretePrototype.getHobbies());
        System.out.println(clone.getHobbies());

    }
}
