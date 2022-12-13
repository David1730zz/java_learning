/**
 * 方法的重载 overload
 * 1. 在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
 * 两同一不同：同一个类、相同方法名
 * 参数列表不同，参数个数不同，参数类型不同
 */

public class OverLoadTest {
    public void getSum(int i,int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1,double d2) {
        System.out.println(d1 + d2);
    }
    public void getSum(int i,String s1){

    }
    public void getSum(String s,int i){

    }
}
