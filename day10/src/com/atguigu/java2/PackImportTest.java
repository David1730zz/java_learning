package com.atguigu.java2;

import com.atguigu.exer4.Bank;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

/*
一、package关键字的使用（包）
1. 为了管理项目中类的管理，提出包的概念
2. 使用package声明类或接口所属的包，声明在源文件的首行
3. package属于标识符，遵循标识符的命名规则、规范（xxxyyyzzz）、“见名知义”
4. 每.一次就是一层目录

同一个包下不能重复命名相同的接口、类
不同的包下，可以命名同名的接口、类，可以通过导入来使用

二、import关键字的使用
import：导入
1. 在源文件中导入指定包下的类、接口
2. 声明在包的声明和类的声明之间
3. 多个结构的导入并列写出即可
4. 可以使用xxx.*的方式表示可以导入xxx包下的所有结构
5. java.lang包下省略导入操作
6. 如果使用的类或接口是本包下定义的，则可以省略import结构
7. 若有多个同名类，则后面的需要以全类名的方式显示
8. 假如以xxx.*的方式导入所有结构，当使用子包内的结构时，还需要全类名显示
9. import static 可以导入静态结构（类或接口）
 */
public class PackImportTest {
    public static void main(String[] args) {
        Arrays.toString(new int[] {1,2,3,4});
        Bank bank = new Bank();
        HashMap hashMap = new HashMap();
//        System.out.println("haxi:" + hashMap.put(1,2));
        float a = Math.round(12.434);
        System.out.println(a);
    }
}
