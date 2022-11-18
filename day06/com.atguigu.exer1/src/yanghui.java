/*
杨辉三角的数组实现方法
 */

public class yanghui {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];//动态初始化

        //给数组的元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = 1;  //每行的第一位设1
            yanghui[i][i] = 1;  //每行的最后一位设1
            //给每行的非首末元素赋值
            if(i > 1){
                for(int j = 1; j < yanghui[i].length - 1; j++) {
                    yanghui[i][j] = yanghui[i - 1][j - 1]+yanghui[i - 1][j];
                }
            }
        }

        //遍历显示杨辉三角当前数值
        for(int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
