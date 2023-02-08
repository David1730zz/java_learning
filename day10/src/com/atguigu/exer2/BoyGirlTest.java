package com.atguigu.exer2;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",25);
        boy.shout();

        Girl girl = new Girl("朱丽叶",18);
        girl.Marry(boy);

        Girl girl1 = new Girl("祝英台",19);
        int compare_result = girl.compare(girl1);
        if (compare_result > 0) {
            System.out.println(girl.getName() + "big");
        } else if (compare_result < 0) {
            System.out.println(girl1.getName() + "little");
        }else {
            System.out.println(girl1.getName() + "和" + girl.getName() + "一样大");
        }
//        System.out.println();
    }
}
