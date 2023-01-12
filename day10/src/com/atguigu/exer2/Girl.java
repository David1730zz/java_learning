package com.atguigu.exer2;

public class Girl {
    private String name;
    private int age;
/*****************************************************************/
    public Girl(){

    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**********************************************/
    public void Marry(Boy boy){
        System.out.println("我想嫁给：" + boy.getName());
//        boy.Marry(new Girl());
        boy.Marry(this); //打印我想娶谁谁谁
    }

//    public int compare(Girl girl){
//
//    }
}
