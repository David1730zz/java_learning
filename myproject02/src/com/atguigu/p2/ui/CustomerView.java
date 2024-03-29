package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

import java.sql.SQLOutput;

/**
 * 交互
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer customer = new Customer("张大为",'男',26,"13991981730","1905021@sust.edu.cn");
        customerList.addCustomer(customer);
    }
    /**
     * 显示客户管理软件ui的方法
     */

    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
        System.out.println("\n--------------客户信息管理软件--------------");
        System.out.println("                1. 添加客户");
        System.out.println("                2. 修改客户");
        System.out.println("                3. 删除客户");
        System.out.println("                4. 客户列表");
        System.out.println("                5. 退出系统\n");
        System.out.println("                请选择（1-5）：");

           char menu = CMUtility.readMenuSelection();
           switch (menu){
               case '1':
                   addNewCustomer();
                   break;
               case '2':
                    modifyCustomer();
                    break;
               case '3':
                    deleteCustomer();
                    break;
               case '4':
                   listAllCustomer();
                   break;
               case '5':
                   System.out.println("退出系统！\n");
//                  break;
                   System.out.println("是否确认退出（Y/N）：");
                   char isExit = CMUtility.readConfirmSelection();
                   if (isExit == 'Y'){
                       isFlag = false;
                   }
           }
//        isFlag = false;
        }
    }
    /**
     * 添加客户的操作
     */
    private void addNewCustomer(){
        System.out.println("--------------添加客户-------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱：");
        String email  = CMUtility.readString(30);
        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccessful = customerList.addCustomer(customer);
        if(isSuccessful){
            System.out.println("--------------添加客户成功！--------------");
        }else{
            System.out.println("----------客户目录已满，添加失败!------------");
        }
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer(){
        System.out.println("------------------修改客户信息----------------");
        Customer cust;
        int number; //客户的编号
        for(;;){
            System.out.println("--------请选择修改客户的编号：（-1退出）");
            number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1); //使用方法宏定义 cust对象
            if(cust == null){
                System.out.println("无法找到指定的客户");
            }else{
                //找到了相应客户
                break;
            }
            }
        //修改客户信息
        System.out.println("姓名（" + cust.getName() + "）：");
        String name = CMUtility.readString(10,cust.getName());
        System.out.println("性别（" + cust.getGender() + "）：");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.println("年龄（" + cust.getAge() + "）：");
        int age = CMUtility.readInt(cust.getAge());
        System.out.println("电话（" + cust.getPhone() + "）：");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.println("邮箱（" + cust.getEmail() + "）：");
        String email = CMUtility.readString(30,cust.getEmail());
        //把修改的信息放在新的newCust对象里
        Customer newCust = new Customer(name,gender,age,phone,email);
        boolean isrepalced = customerList.replaceCustomer(number - 1, newCust);
        if(isrepalced){
            System.out.println("------------------修改完成！-------------------");
        }else{
            System.out.println("------------------修改失败！-------------------");
        }
    }




    /**
     * 删除客户的操作
     */
    private void deleteCustomer(){
        System.out.println("------------删除客户------------");
        int number;
       for(;;) {
           number = CMUtility.readInt();
           System.out.println("请选择待删除的客户编号（-1退出）：");
           if (number == -1) {
               return;
           }
           Customer customer = customerList.getCustomer(number - 1);
           if (customer == null) {
               System.out.println("无法找到指定客户！");
           } else {
               break;
           }
       }
       //找到了指定客户
        System.out.println("是否确认删除（Y/N）");
       char isDelete = CMUtility.readConfirmSelection();
       if(isDelete == 'Y'){
           boolean deletSuccess = customerList.deleteCustomer(number - 1);
           if(deletSuccess){
               System.out.println("删除成功！");
           }else{
               System.out.println("删除失败！");
           }
       }else{
           return;
       }
    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomer(){
        System.out.println("-----------------客户列表-----------------");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户记录！");

        }else{
            System.out.println("编号\t姓名\t\t性别\t年龄\t\t电话\t\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomer();
            for(int i = 0; i < custs.length; i++){
                Customer cust = custs[i];//把custs数组内的每一个元素都  循环  赋值给cust对象 cust是customer类的一个对象
                System.out.println((i + 1) + "\t" + cust.getName()+"\t"+cust.getGender()+"\t"+ cust.getAge()
                        + "\t" + cust.getPhone() +"\t" + cust.getEmail());
            }
        }
        System.out.println("-----------------客户列表完成-----------------");
    }

    public static void main(String[] args) {
        CustomerView View = new CustomerView();
        View.enterMainMenu();
    }


}
