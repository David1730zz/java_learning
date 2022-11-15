/*
从键盘读取学生成绩，找出最高分，并输出学生成绩等级
        成绩>=max-10 A
        -20 b
        -30 c
        其他 d

 */
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生数量");
        int count = scan.nextInt();
        int [] scores = new int[count];
        System.out.println("请输入" + count + "个学生的成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
        }

        char level;
        for (int i = 0; i < scores.length; i++) {
            if(max - scores[i] <= 10){
                level = 'A';
            }else if(max - scores[i] <= 20){
                level = 'B';
            }else if(max - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student:" + i + "scores:" + scores[i] + "level:" + level);
        }






        /*//sleep(50);
        Scanner scan  = new Scanner(System.in);
        System.out.println("请输入学生数量：");
        int count = scan.nextInt();

        //创建数组
        int [] scores = new int[count];
        System.out.println("请输入" + count + "个学生的成绩");
        for(int i = 0; i < scores.length; i++){
            scores[i] = scan.nextInt();
        }

        //求最大值
        int max = 0;
        for(int i = 0; i < scores.length; i++){//遍历列表
            if(max < scores[i]){
                max = scores[i];
            }
        }

        //计算每个学生与最高分的差值
        //sleep(1000);
        char level;
        for(int i = 0; i < scores.length; i++){
            if(max - scores[i] <= 10){
              level = 'A';
            }else if(max - scores[i] <= 20){
                level = 'B';
            }else if(max - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student:" + i + "scores is:" + scores[i] + "level is:" + level);
            //如果为scores[count]，意思是scores[5]，也就是固定数组的某个元素，会报错
        }
*/


    }
}
