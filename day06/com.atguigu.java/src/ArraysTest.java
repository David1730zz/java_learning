/*
java数组工具类
定义了很多操作数组的方法
 */

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,5,6,9,7};
        int[] arr2 = new int[]{3,9,8,4,7};
       //boolean equals(int[] a, int[] b):判断两个数组是否相等
        boolean tf =  Arrays.equals(arr1, arr2);
        System.out.println("结果是：" + tf);



        //2. String toString(int[] a); 输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3. void  fill(int[] a, int[] val)
        Arrays.fill(arr1,10);
        System.out. println(Arrays.toString(arr1));

        //void sort
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //binarySearch(arr)
        //new才是new一个堆中的空间，直接=是将地址值复制过去
        int[] arr3 = new int[]{3,6,7,566,785,963,15236,25689};
        int result = Arrays.binarySearch(arr3,15236);
        if (result >= 0) {
            System.out.println(result);
        }else {
            System.out.println("没找到结果");
        }
        //冒泡排序的练习
            int[] arr4 = new int[]{10,8,36,12,14,85,72,63};

            for(int i = 0; i < arr4.length - 1; i++){
                for(int j = 0; j < arr4.length - i - 1; j++){
                    if(arr4[j] > arr4[j + 1]) {
                        int temp = arr4[j];
                        arr4[j] = arr4[j + 1];
                        arr4[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr4));

    }
}
