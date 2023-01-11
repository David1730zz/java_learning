package com.atguigu.java1;
//import com.atguigu.exer.Person;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int scan = scanner.nextInt();
        PersonConstruct b = new PersonConstruct();
//        b.age = 1; 因为age为私有化 所以直接调不出来；
        b.setAge(scan);
        int vison = b.getAge();
        System.out.println("你" + vison + "岁啦!");
    }
}
