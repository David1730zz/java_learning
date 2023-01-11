package com.atguigu.exer1;
/*
编写两个类，TriAngle和TriAngleTest，
其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访间私有变量.
此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngle {
    private double base;
    private double height;
    //构造器及构造器的重载 及参数列表不同
    public TriAngle(){
        //空参
    }
    public TriAngle(double b, double h){
        base = b;
        height = h;
    }

    public void setBase(double b) {
        base = b;
    }
    public double getBase() {
        return base;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight() {
        return height;
    }
}
