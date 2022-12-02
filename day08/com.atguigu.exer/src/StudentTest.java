/**
 * 定义类Student，包含三个属性: 学号number(int)，年级state(int)，成绩score(int)
 * 创建20个学生对象，学号为1到28，年级和成绩都由随机数确定。
 * 问题一:打印出3年级(state值为3) 的学生信息。
 * 问题二，使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示:
 * 生成随机数，Math.random()，返回值类型double;
 * 四舍五入取整，Math.round(double d)，返回值类型long.
 */

public class StudentTest {
    public static void main(String[] args) {
        //声明student类型的数组 数组的元素可以是任何数据类型，我们自己定义的Student类类型也可以 该数组对象里有20个元素
        Student[] stus = new Student[20];//String[] arr = new String[20];
        for(int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student();
            //给Student对象（元素）的属性赋值
            //学生数量：
            stus[i].number = (i + 1);
            //年级 1-6
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩：0-100
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));

        }
        for(int i = 0; i < stus.length;i++){
            System.out.println(stus[i].info());
        }System.out.println("   ");
        //问题一:打印出3年级(state值为3) 的学生信息。
        for(int i = 0; i < stus.length; i++){
            if(stus[i].state == 3){
                System.out.println("找到的是：" + stus[i].info());
            }
        }
        //问题二，使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0; i < stus.length - 1; i++) {
            for(int j = 0; j < stus.length - i - 1; j++){
                if(stus[j].score > stus[j + 1].score) {
                   //如果需要换序，交换的是数组的元素，也就是student对象，而不是成绩
                    Student temp = stus[j + 1];
                    stus[j + 1] = stus[j];
                    stus[j] = temp;
                }
            }
        }
        for(int i = 0; i < stus.length; i++){
            System.out.println("排序后的成绩是：" + stus[i].info());
        }


        //遍历学生数组
        /*for(int i = 0; i < stus.length; i++) {
            System.out.println("stus[i] = " + stus[i].score + "  "
                    + stus[i].state + "  " + stus[i].number + "  ");
        }*/
    }
}
//对象 > 类 = 属性 = 方法
class Student{
    int number; //学号
    int state;  //年级
    int score;  //成绩
    //显示学生信息的方法
    public String info(){
        return "学号：" + number + "年级是：" + state + "成绩是：" + score;
    }
}
