/*
    数组元素的默认初始化值
        整型数组默认初始化值是0
        浮点型：0.0
        char型：0（ACSII码是0）
        数组元素是boolean型：false（二进制用false=0）


        引用数据类型：null，意思是空值 注意：不是“null”
    数组的内存解析：见arraytest2
 */

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        short[] array1 = new short[5];
        for(int j = 0; j < array1.length; j++){
            System.out.println(array1[j]);
        }

        float[] array2 = new float[5];
        for(int k = 0; k < array2.length; k++){
            System.out.println(array2[k]);
        }

        char[] arraty3 = new char[3];
        for(int i = 0; i < arraty3.length; i++){
            System.out.println(arraty3[i]);
        }
            if(arraty3[1] == 0){
                System.out.println("你好！");
            }
        boolean[] arr4 = new boolean[4];
            System.out.println(arr4[1]);

        String[] arr5 = new String[5];
       // System.out.println(arr5[0]);
        if(arr5[2] == null){
            System.out.println("hahah");
        }
    }
}
