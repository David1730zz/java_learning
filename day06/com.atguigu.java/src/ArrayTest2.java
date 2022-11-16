/*
二维数组的使用
：可以看作是一维数组加一个一维数组，从数组的运行机制来看，没有多维数组

二维数组的使用：
    声明和初始化
    如何调用数组指定位置的元素
    如何获取数组的长度
    如何遍历数组
    数组元素的默认初始化值 见arraytest3
    数组的内存解析
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] array = new int[]{1,2,3};
        //静态初始化
        int[][] arr4 = new int[][]{{1,2,3},{1,2},{2,3,4}};
        //动态初始化
        //sleep(500);

        String[][] arr3 = new String[2][3];

        String[][] arr5 = new String[2][];
        int[] arrfake = {1,2,3};
        //获取二维数组长度
        System.out.println(arr4[2][1]);
        System.out.println(arr3[0][1]);
       //获取二维数组长度
        System.out.println("arr4的长度是：" + arr4.length);
        //如何遍历二维数组
        //几维数组就需要几个for循环
        for(int i = 0; i < arr4.length;i++){
            for(int j = 0; j < arr4[i].length;j++){
                System.out.print("遍历arr4的结果是：" + arr4[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
