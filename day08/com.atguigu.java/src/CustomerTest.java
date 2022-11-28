/**
 * 类中方法的声明和使用
 *方法：描述
 * 比如：Math类 sqrt random
 *      Scanner类：next
 *      Arrays类：sort、binarySearch、toString、equals
 * 1. 举例 定义几个方法
 * 2. 方法的声明：
 * 权限修饰符 返回值类型 方法名（形参列表）{
 *                   方法体
 * }
 * static final abstract
 * 3. 说明
 *        3.1 关于权限修饰符:默认方法的权限修饰符先使用public
 *        private static final 缺省 protect
 *        3.2 返回值的类型：有返回值 和 没有返回值的
 *        3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型
 *              使用return关键字来返回指定类型的变量或者常量：return 数据
 *              如果方法没有返回值，则方法声明时，用void表示。在没有返回值的方法中，不用return，但如果使用的话只能用  return
 *        3.2.2 我们定义方法该不该有返回值？ 看经验
 *        3.3 方法名：标识符 遵循标识符的规则和规范
 *        3.4 形参列表 方法可以声明0个 1个 或多个形参
 *        3.4.1 格式：数据类型1 形参1 数据类型2 形参2....
 *        3.4.2 我们定义方法该不该有形参？
 *        3.5 方法体：主要功能的体现
 * 4. return关键字的作用：
         * 1. 范围：作用在方法体中
         * 2. 作用：结束方法、针对有返回值类型的方法，使用 return 数据 结束方法并返回指定的数据
         * 3. return后不能有执行语句
 * 5. 方法的使用中，可以调用当前类的属性或者方法
 *              特殊的，方法A中又调用了方法A：递归方法
 *              方法中不能再嵌套地定义方法
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
    }
}

//客户类
class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "我的国籍是" + nation;
        return info;
    }
}