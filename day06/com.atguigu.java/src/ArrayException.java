/*
数组中的常见异常
1. 数组角标越界：ArrayIndexOutOfBoundsException
2. 空指针异常：NullPointerException
 */
public class ArrayException {
    public static void main(String[] args) {
       // 1. 数组角标越界：ArrayIndexOutOfBoundsException
        //int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        //for(int i = 0; i <= arr.length; i++) { //i<=arr.length错误，i< arr.length为正确
          //  System.out.println(arr[i] + " ");

            //2. 空指针异常：NullPointerException
            /*int[] arr1 = new int[]{1,2,3};
            arr1 = null;
            System.out.println(arr1[0]);*/

            //情况2
           // int[][] arr2 = new int[4][];
           // System.out.println(arr2[0][0]);

            //情况3
            String[] arr3 = new String[]{"AA","BB","CC","DD"};
            arr3[0] = null;
            System.out.println(arr3[0].toString());


        }
    }

