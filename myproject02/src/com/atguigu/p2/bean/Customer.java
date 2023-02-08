package com.atguigu.p2.bean;

/**
 * @Description 实体对象，封装客户信息
 * @author zdw
 */
public class Customer {
    private String name;//mingzi
    private char gender;//xingbie
    private int age;//年龄
    private String phone;//电话号码
    private String email;//邮箱

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //构造器
    //空参构造器
    public Customer() {
    }
    //全参构造器
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
