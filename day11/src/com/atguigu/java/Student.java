package com.atguigu.java;


public class Student extends Person{ //extends + 类名
//    String name;
//    int age;
    String major;

    public Student(){

    }
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
