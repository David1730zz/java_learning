package com.atguigu.exer2;

public class Boy {
    public static void main(String[] args) {
        
    }
    private String name;
    private int age;
    //构造器***********************************
    public Boy() {
    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /********************************************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//**************************************************************
    public void Marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("合法登记");
        }else{
            System.out.println("多谈恋爱");
        }
    }


}

