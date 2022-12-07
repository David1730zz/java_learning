public class HelloWorld {
    public static void main(String []args) {
        //System.out.println("Hello World!");
        test test = new test();
        test.sort();
    }
}
class test{
    int[] arr1 = {1,5,6,9,7,52,2,36};
    public void sort(){
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0; j < arr1.length - 1 - i; j++){
                if(arr1[j]> arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j] = arr1[j + 1];
                }

            }
        }
        for (int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i]);
        }

    }



}
