/**
 * 类中属性的使用
 *
 * 属性（成员变量） vs 局部变量
 *
 * 1. 相同点
 *
 *
 * 2. 不同点
 *      2.1 在类中声明的位置的不同
 *      属性：直接定义在类的一对{}内
 *      局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 */

public class UserTest {
}

class User{
    //属性（成员变量）
    String name;
    int age;


    public void talk(String language){
        System.out.println("我们使用" + language + "进行交流")
    }
}


