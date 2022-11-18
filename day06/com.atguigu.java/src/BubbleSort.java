/**
 * 数组的冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
/***************************************************************************/
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]) {//如果第一个比第二个大，那就交换，使得第一个比第二个小
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


//冒泡排序
        /*
        for(int i = 0; i < arr.length - 1; i++) {//循环条件是冒泡排序的关键
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
*/

        //遍历显示数组状态
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
