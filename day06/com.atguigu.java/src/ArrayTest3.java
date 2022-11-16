/*
二维数组使用：
    规定：二维数组分为外层数组元素，内层数组的元素
    int arr = new int [4][3];
    外层元素：arr[0],arr[1]等
    内层：arr[0][1],arr[0][2]
            数组元素的默认初始化值
                针对初始化方式1：int[][] arr = new int[4][4];
                    外层元素初始化值为：地址值
                    内层元素的初始化值为：与一维数组初始化情况相同
                针对初始化方式2：比如：int[][] arr = new int[4][];
                    外层元素的初始化值为：null
                    内层元素的初始化值为：不能调用，报错
            数组的内存解析


 */

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][3];
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);
       // arr1[0][1] = {{1,2,3},{2,3,4}};
    }

}
