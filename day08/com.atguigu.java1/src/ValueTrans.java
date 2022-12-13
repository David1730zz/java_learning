/**
 * 关于变量的赋值
 */

public class ValueTrans {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("m = " + m + " " + "n = " + n);

        n = 20;
        System.out.println("m = " + m + " " + "n = " + n);
        System.out.println("***********************************");

        System.out.println("*********引用数据类型*******************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
    }
}
class Order{
    int orderId;
}
