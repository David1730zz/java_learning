package com.atguigu.java1;
/**
 * 类的结构之三：构造器或构造方法（constructor）的使用
 * construct：建设 建造 construction constuctor 建设者
 * 一、构造器的作用：
 * 1. 创建对象
 * 2. 初始化对象的属性
 * 二、说明
 * 1. 如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2. 定义构造器的格式：使用权限修饰符  类名(形参列表){}   new Person()
 * 3. 一个类中定义的多个构造器，彼此构成重载
 * 4. 一旦显式地定义了类的构造器后，系统不在提供默认的空参构造器
 * 5. 一个类中至少有一个构造器，可能是默认的也可能是设置的
 */
public class gouzaoqi {
    public static void main(String[] args) {
       //创建类的对象
        Person p = new Person();
        p.eat();
        Person p1 = new Person("tom");
    }

}
class Person{
    //属性
    String name;
    int age;
    //构造器
    public Person(){//与类同名
        System.out.println("Person()......");
    }
    public Person(String n){
        name = n;
    }
    public Person(String n,int a){
        name = n;
        age = a;
    }
    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void learn(){
        System.out.println("人学习");
    }
}
