/*
    求数组中的最大值、最小值、和、平均值
    要求数组的数据是随机数，且都是两位数
 */

public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {//用Math.random()来输出随机数
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }

        //求数组的最大值
        int max = arr[0]; //最大值最好不要写0，写成数组内的随意元素
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        //求数组的最小值
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);
        //求数组的总和
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组总和为：" + sum);


        //求数组的平均值
        float avg = sum / arr.length;
        System.out.println("平均数为：" + avg);

    }
}
