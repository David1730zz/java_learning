/**
 *一、理解”万事万物皆对象“
 * 1. 在java语言中，功能和结构都封装在类里面，通过类的实例化（新建对象）调用具体的功能结构
 * 2. 涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，体现为类、对象
 * 二、匿名对象的使用
 * 1.理解：创建的对象没有显式地设置一个变量名，即为匿名对象
 * 2.特征：匿名对象只能调用一次，再使用是另一个对象了
 * 3.
 */

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.sedEmail();
        p.playGame();
        //匿名对象
        new Phone().sedEmail();
        new Phone().playGame();
        new Phone().showPrice();

    }


}
class PhoneMall{
    public void show(Phone phone){
        phone.playGame();
        phone.showPrice();
        phone.sedEmail();
    }
}
class Phone{
    double price;
    public void sedEmail(){
    System.out.println("发邮件");
    }
    public void playGame(){
        System.out.println("打游戏");
    }
    public void showPrice(){
        System.out.println("这个手机的价格是19999" + price + "");
    }
}
