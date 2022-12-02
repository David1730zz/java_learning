/**
 * 计算圆的面积
 */

import java.math.MathContext;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();//new新对象：c1
        //交互并读取
        System.out.println("请输入要计算的圆半径：");
        Scanner scanner = new Scanner(System.in);
        double temp1 = scanner.nextDouble();

        c1.radius = temp1; //类的属性：radius 赋值
/*  ******************************对应方式1
        double temp = c1.Area();
        System.out.println("圆的面积是：" + temp);*/
        //对应方式2
        c1.Area(); //直接调Area方法，在方法内输出结果
    }
}
//圆
class Circle{
    //属性
    double radius;

    //方法1：求圆的面积
    /*public double Area(){
        double area = 3.14 * radius * radius;
        return area;
    }*/
    //方法2：求圆的面积
    public void Area(){
        double area = 3.14 * radius * radius;
        System.out.println("面积为：" + area);
    }
}
