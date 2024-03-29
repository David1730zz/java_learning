package com.atguigu.java1;

/**
 * 总结：属性赋值的先后顺序
 * 1. 默认初始化值
 * 2. 显式初始化值
 * 3. 构造器中赋值
 * 4. 通过“对象.方法”或“对象.属性”的方式初始化值
 *
 * 以上初始化值的先后顺序
 * 1 - 2 - 3 - 4
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);
        User u1 = new User();


    }
}

class User{
    String name;
    int age;
//    构造器
    public User(){

    }

    public User(int a){
        age = a;
    }
//set方法
    public void setAge(int a){
        age = a;
    }
}

