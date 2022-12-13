public class HelloWorld {
    public static void main(String []args) {
        //System.out.println("Hello World!");
        int[] arr1 = {1,5,6,9,7,52,2,36};
        test test = new test();
        test.sort(arr1);
        for (int i = 0; i < arr1.length; i++){
            System.out.print(" " + arr1[i] + " ");
        }
    }
}
class test{
   // int[] arr1 = {1,5,6,9,7,52,2,36};
    public void sort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j]> arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }


    }



}
