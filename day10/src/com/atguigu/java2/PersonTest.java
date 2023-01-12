package com.atguigu.java2;

/**
 * this关键字的使用
 * 1.this可以用来修饰当前属性、方法、构造器
 * 2.this修饰属性和方法
 * this可以理解为当前对象
 *  在类的方法中，可以使用“this.属性”或“this.方法”的方式调用当前对象中的属性或方法
 *  但通常情况下都省略this.。
 *  特殊情况下，如果方法的形参和类的属性同名时，我们必须显式地使用this.变量表明此变量是属性，而非形参
 * 3. this调用构造器，可以显式地使用this(形参列表)的方式，调用本类中指定的其他构造器
 * 构造器中不能通过this(形参列表)的方式调用自己
 * 如果一个类中有n个构造器，则最多有n-1个构造器中使用了this(形参列表)
 * 规定：this(形参列表)必须声明在构造器的首行
 *构造器内部，
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("jerry0");
        p1.setAge(1);
        System.out.println(p1.getAge());

        p1.eat();
//        Person p2 = new Person("Jerry");
    }
}


class Person{
    private String name;
    private int age;
//构造器
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(String name, int age){
//        this("name",age);
        this(age);//this调用构造器，赋值age
        this.name = name;
        this.age = age;
    }


//set和get
    public void setName(String name){
        this.name = name; //this可以理解为当前对象，this.name是当前对象的name属性

    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //方法
    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }
    public void study(){
        System.out.println("人学习");
    }
}