package com.atguigu.exer4;

public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomers;//记录客户的个数

    public Bank(){
        customers = new Customer[10]; //新建一个customer数组 customers 里面有10个元素
    }

    /*************************************************/
    //添加用户的信息


    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);

        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
    }
    //获取用户的个数
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    //获取指定位置的客户
    public Customer getCustomer(int index){
//        return customers[index];
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];  //customers【】是存放多个客户的数组
        }else{
            return null;
        }
    }

}
