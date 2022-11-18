/*
算法的考察
    数组的复制、反转、查找（线性查找、二分法查找）
 */


public class ArrayTest4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "CC", "AA", "MM"};
        //数组复制 区别于数组变量的赋值
        String[] arr1 = new String[arr.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
          for(int i = 0; i < arr.length / 2; i++) {
              String temp = arr[i];
              arr[i] = arr[arr.length - i - 1];
              arr[arr.length - i - 1] = temp;
          }

          //遍历
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        //查找
        //线性查找：
        String aim = "AA";
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            if(aim.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为：" + i);
                flag = false;
                break;
            }
        }
       if(flag == true){
           System.out.println("没找到数据");
       }
/*****************************************************************************************/
       //二分法查找：使用前提是数组有序。 即按照 从小到大或者 从大到小的顺序排列
        int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
       int aim1 = -34;//设定搜索目标值
       int head = 0;  //初始的首索引
       int end = arr2.length - 1;//初始的末索引


        boolean flag1 = true;
       while(head <= end){
           int middle = (head + end) / 2;
           if(aim1 == arr2[middle]){                //如果数组中间值是目标，那就是找到了
               System.out.println("找到了指定元素，位置为：" + middle);
               flag1 = false;
               break;
           }else if(arr2[middle] > aim1){     //如果数组中间项的值大于目标值，则说明目标值在数组的左边，即middle - 1
               end = middle - 1;   //搜索索引值的末尾 -1
           }else{            //如果数组中间项的值小于目标值，则说明目标值在数组的右边，即middle + 1
               head = middle + 1;     //  搜索索引值的初始值 + 1
           }
       }

       if(flag1){
           System.out.println("没有找到目标！");
       }




    }
}
