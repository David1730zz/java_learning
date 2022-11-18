/*
使用简单数组
创建名为ArrayExer2的类，在main方法中声明array1和array2两个变量，是int数组
array1 8元素 2，3，5，7，11，13，17，19
打印array1内容
赋值array2等于array1，修改array2中的偶索引元素，使其等于索引值，打印array1
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        //显示array1的内容
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "\t");
        }

        //赋值2给1 数组
        //该操作不是数组复制
        //array1和array2的地址值相同，都指向了堆空间中唯一的一个数组实体
        array2 = array1;

        //修改array2中的偶索引元素，使其等于索引值
        for(int i = 0; i < array2.length; i++) {
            if(i % 2 == 0) {
                array2[i] = i;
            }

            //打印array1
            System.out.println("array1是：" + array1);




        }
    }
}
