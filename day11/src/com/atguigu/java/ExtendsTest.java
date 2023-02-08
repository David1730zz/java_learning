package com.atguigu.java;
/**
 * 继承关系
 * extends + 类名，继承对应类的属性、方法等信息
 * 继承性的好处：减少代码冗余，提升复用性
 * 便于功能扩展
 * 为之后多态性的使用提供了前提
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 1;
        person.eat();
        Student s1 = new Student();
        s1.name = "Kim";
        s1.age = 18;
    }
}
