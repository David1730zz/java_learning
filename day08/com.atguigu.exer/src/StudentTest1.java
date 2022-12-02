/**
 * @描述：此代码是对StudentTest的方法封装优化
 * @author:zdw
 * 对象new是类class的实例化，通过对象去操作、使用 类中包含的方法,对象更像一个工具
 * 用stus对象去进行赋值、遍历等操作，只不过stus是Student1的数组对象
 */
public class StudentTest1 {
    public static void main(String[] args) {
        Student1[] stus = new Student1[20];//用这个Student类新建一个stus对象，这个对象可以使用其中的属性
        //属性赋值
        for (int i = 0; i < stus.length; i++){
            stus[i] = new Student1();
            stus[i].number = (i+1);
            stus[i].state = (int)(Math.random() * (6-1+1)+1);
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }//打印信息
        for(int i = 0; i < stus.length;i++){
            System.out.println("你定义的学生数据是：" + stus[i].info());
        }

        StudentTest1 test = new StudentTest1();
        test.Print(stus);
        test.SearchState(stus,3);
        test.Result(stus);
        /*****************************************************************/


    }
    /**
     * @author zdw
     * @description 0. 遍历Student1[] 数组的方法
     */
    public void Print(Student1[] stus){
        for (int i = 0; i < stus.length; i++){
            System.out.println(stus[i].info());
        }
    }
    /**
     * @author zdw
     * @description 1. 打印出3年级的学生信息
     */
    public void SearchState(Student1[] stus,int state){
        for(int i = 0; i < stus.length; i++){
            if(stus[i].state == 3){
                System.out.println("找到的是" + stus[i].info());
            }
        }
    }
    /**
     * @author zdw
     * @description 2. 使用冒泡排序按学生成绩排序，并遍历所有学生信息
     */
    public void SortScore(Student1[] stus){//排序 给哪个数组排序？给Student1[] stus数组排序
        for(int i = 0; i < stus.length - 1; i++){
            for(int j = 0; j < stus.length - i - 1; j++){
                if(stus[j].score > stus[j + 1].score){
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
    /**
     * @author zdw
     * @description 结果的遍历打印方法
     */
    public void Result(Student1[] stus){
        for(int i = 0; i < stus.length; i++){
            System.out.println("最终的结果是：" + stus[i].info());
        }
    }

}


class Student1{
    int number;
    int state;
    int score;

    public String info() {
        return "学号" + number + "年级是：" + state + "成绩是" + score;
    }
}
