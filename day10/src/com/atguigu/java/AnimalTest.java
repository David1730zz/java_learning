package com.atguigu.java;

/**
 * 封装性、集成性
 * 面向对象的特征一：封装与隐藏
 * 一、问题的引入
 * 当我们创建一个类的对象以后，可通过“对象.属性的”的方式，对我们对象的属性进行赋值
 * 这里赋值操作受到属性的数据类型，存储范围的制约 除此之外没有其他制约条件。
 * 但是实际问题中，我们需要给属性赋值，加入额外的限制条件
 * 只能用方法进行限制条件添加（比如 setlegs）
 * 同时，需要避免用户再使用对象.属性的赋值，将 属性声明为 private
 * --》此时，针对于属性就体现了封装性
 *
 * 二、封装性的体现
 * 将类的属性私有化 private，同时提供公共的public 方法获取 get 此属性的值
 *
 * 拓展：封装性的体现：1.如上 2. 不对外暴露私有的方法 3. 单例模式
 *
 * 三、权限修饰符
 * 封装性之所以能体现，就是我们设置了权限修饰符
 * 1. java4种权限 小到大
 * private、缺省、protected、public
 * 2. 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3. 具体的，4种权限都可以修饰类的内部结构：属性、方法、构造器、内部类
 *              修饰类的话，只能使用：缺省、public
 */

public class AnimalTest {
    public static void main(String[] args) {
//        com.atguigu.java.AnimalTest test1 = new com.atguigu.java.AnimalTest();
        Animal a = new Animal();
        a.name = "大黄";
//        a.age = 4;
        a.eat();
//        a.show();
//        a.legs = 2;
        a.setlegs(4);
        a.show();
    }
}

class Animal{
    String name;
    private int age; //提供age的get set方法
    private int legs;  //legs属性为私有，不可以直接调用，必须通过setlegs来更改legs的值

    public void eat(){
        System.out.println("动物进食");
    }
    public  void show(){
        System.out.println("name = " + name + "age = " + age + "legs = " + legs);
    }
    //专门为legs属性的赋值
    public void setlegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            legs = 0;
            System.out.println("胡说八道！");
            //抛出一个异常
        }
    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }
    //提供age的get set方法
    public int getAge(){
        return age;
    }
    public void setAge(int A){
        if(A >= 0 && A <= 100){
            age = A;
        }else{
            System.out.println("error,incorrect age!");
        }

    }
}
