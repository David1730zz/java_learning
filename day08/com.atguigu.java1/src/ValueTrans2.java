import java.util.Arrays;

public class ValueTrans2 {
    public static void main(String[] args) {

//        Data data = new Data();
//        data.m = 10;
//        data.n = 20;
//        System.out.println("m:" + data.m + "n:" + data.n);
        int[] array = new int[]{5,96,55,74,-24,-96,-1,123,100};
        Data tool = new Data();
        tool.exchange(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "     ");
        }
//
//        for(int i = 0; i < array.length - 1; i++){
//            for(int j = 0; j < array.length - i - 1; j++){
//                if(array[j] > array[j + 1]){
//                    int temp = array[j];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
    }

}
class Data{

    public void exchange(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
