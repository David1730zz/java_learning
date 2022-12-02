/*public class MatrixTest {
    public static void main(String[] args) {
        MatrixTest test = new MatrixTest();
        int area = test.method();
        System.out.println("面积为：" + area);
    }



    public int  method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }
}*/
public class MatrixTest {
    public static void main(String[] args) {
        MatrixTest test = new MatrixTest();

        //int return_temp = test.method(12,9);
        test.method(12,9);
        //System.out.println("返回变量为：" + return_temp);
    }


    public int method(int m, int n) {//在MatrixTest类里面写一个新的 方法
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}


