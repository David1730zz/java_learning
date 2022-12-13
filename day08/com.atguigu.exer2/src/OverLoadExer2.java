/**
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 2.定义三个重载方法max()
 * 第一个方法求两个int值中的最大值
 * 第二个方法求两个double值中的最大值
 * 第三个方法求三个double值中的最大值并分别调用三个方法。
 */
public class OverLoadExer2 {
    //如下三个方法是重载
    public void mOL(int i){
        System.out.println(i * i);
    }
    public void mOL(int i,int j){
        System.out.println(i * j);
    }
    public void mOL(String s){
        System.out.println(s);
    }
    double z = 46.2, x = 53.1, c = 12.3;
    public void main(String[] args) {
        Max test = new Max();
        test.max1(z, x, c);

    }
}
class Max{
    public int max(int i, int j){
        if(i < j){
            return j;
            //System.out.println("最大值是：" + j);
        }else{
            return i;//System.out.println("最大值是" + i);
        }
    }
    public double max(double i, double j){
        if(i < j){
            return i;//System.out.println("最大值是：" + j);
        }else{
            return j;//System.out.println("最大值是" + i);
        }
    }
    public double max1(double i, double j,double k){
        double[] array = {i, j, k};
        for(int a = 0; a < array.length - 1; a++){
            for(int b = 0; b < array.length - i - 1; b++){
                if(array[b] < array[b + 1]){
                    double temp = array[b + 1];
                    array[b + 1] = array[b];
                    array[b] = temp;
                }
            }
        }

        return array[3];
        }
}


