package com.atguigu.java1;


/**
 * 1. setAge定义人的合法年龄 getAge返回人的年龄
 *
 * persontest实例化person类的对象b 调用set和getAge方法，体现封装性
 *
 * 2. 在前面定义的Person类中添加构造器，使用构造器设定所有人的age属性的初始值为18
 *      修改上面中的类和构造器，增加name属性
 *      使得每次创建的Person对象的同时初始化对象的age属性和name属性值
 */
public class PersonConstruct{
    public static void main(String[] args) {

    }
    private int age;
    //用这个构造器造对象式，age都为18
    public PersonConstruct(){
        age = 18;
    }
    public void setAge(int A) {
        if(A > 0 && A < 130){
            age = A;
        }else{
            age = 0;
            throw new RuntimeException("胡说八道啥呢！");
//            System.out.println("胡说八道！");
        }
    }
    public int getAge(){
        return age;
    }
}
