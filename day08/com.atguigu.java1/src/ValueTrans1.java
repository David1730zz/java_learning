/**
 * 方法形参的传递机制，值传递
 *
 * 1. 形参：方法定义时，声明的小括号内的参数
 * 2. 实参：方法调用时，实际传递给形参的值
 */

public class ValueTrans1 {
    public static void main(String[] args) {
        //交换两个变量的值
        int m = 10;
        int n = m;
        System.out.println("m = " + m + " " + "n = " + n);
//        int temp = m;
//        m = n;
//        n = temp;
        ValueTrans1 test1 = new ValueTrans1();
        test1.swap(m, n);
    }
    public void swap(int m,int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
