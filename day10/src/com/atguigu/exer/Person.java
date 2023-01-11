package com.atguigu.exer;

/**
 * 1. setAge定义人的合法年龄 getAge返回人的年龄
 *
 * persontest实例化person类的对象b 调用set和getAge方法，体现封装性
 */
public class Person {
    public static void main(String[] args) {

    }
    private int age;
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

