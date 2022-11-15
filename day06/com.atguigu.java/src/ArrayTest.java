/*
数组：多个相同类型按照一定顺序排列的集合，用一个名字命名，并通过编号的形式统一管理
数据的类型是引用数据类型，数组的元素是另一种数据类型，可以是基本数据类型，也可是引用数据类型
数组是有序排列的

数据在内存空间中是连续的
数组的长度一旦确定就不能轻易修改

数组的分类：
    按照维度：分为一维、二维、三维等等
    按照数组元素类型：基本数据类型元素数组；引用数据类型元素的数组

一维数组的使用：
    声明和初始化
    如何调用数组指定位置的元素
    如何获取数组的长度
    如何遍历数组
    数组元素的默认初始化值 见arraytest1
    数组的内存解析
 */

public class ArrayTest {
    public static void main(String[] args) {
       //一维数组初始化
       int num;//声明
        num = 10;
        int id = 1001;//声明+初始化

        int[] ids;//声明ids数组,声明ids数组元素的类型为int
        //静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        //数组一旦初始化完成，数据长度就确定了

        //2. 如何调用数组的指定位置的元素：下角标的方式
        //java数组的角标从0开始，到数组的长度-1结束
        names[0] = "王名";names[1] = "王和";names[2] = "张血量";
        names[3] = "权志龙";names[4] = "王大致";

        //3. 如何获取数组长度：属性：length
        System.out.println(names.length);
        int i = names.length;
        System.out.println  (i);

        //4. 如何遍历数组
        for(int j = 0; j < names.length; j++){
            System.out.println(names[j]);
        }
    }
}
