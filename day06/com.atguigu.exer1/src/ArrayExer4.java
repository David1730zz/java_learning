public class ArrayExer4 {
    public static void main(String[] args) {
        //数组的复制
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};
        arr2 = new int[arr1.length];//arr2是新new的，所以是新的堆空间
            for(int i=0;i<arr2.length;i++){
                arr2[i] = arr1[i];
            }
    }
}
