/**
 * 递归 在一个方法体内调用他自身
 */
public class RecursionTest {
    //例1：计算1-100之间所有数的和
    public static void main(String[] args) {
        //method 1
        /*int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }*/
        RecursionTest test = new RecursionTest();
        System.out.println(test.getSum(100));
        System.out.println(test.f(10));;
    }
    public int getSum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + getSum(n - 1); //递归方法
        }
    }
    //已知有一个数列: f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n)
    //其中n事大于0的整数，求f(10)的值。
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
//            return f(n + 2) - 2 * f(n + 1); 错误
            return 2 * f(n-1) + f(n - 2);
        }
    }
    //斐波那契数列 一个数等于前两个数之和

}
