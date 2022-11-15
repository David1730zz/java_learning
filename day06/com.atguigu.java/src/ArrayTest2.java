/*
二维数组的使用
：可以看作是一维数组加一个一维数组，从数组的运行机制来看，没有多维数组

二维数组的使用：
    声明和初始化
    如何调用数组指定位置的元素
    如何获取数组的长度
    如何遍历数组
    数组元素的默认初始化值
    数组的内存解析
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] array = new int[]{1,2,3};
        //静态初始化
        int[][] arr1 = new int[][] {{1,2,3},{1,2,3},{1,2,3}};
        //动态初始化
        String[][] arr3 = new String[2][3];

        String[][] arr4 = new String[2][];
    }
}
