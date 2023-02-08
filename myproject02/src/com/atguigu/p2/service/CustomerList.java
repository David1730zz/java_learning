package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @Description customer对象的管理模块，内部用数组管理一组Customer对象
 * 并提供对应的添加、修改、删除、遍历方法，供Customer调用。
 * @Author zdw
 */
public class CustomerList {
   private Customer[] customers;//保存客户对象的数组
   private int total = 0;//记录已保存客户对象的总数


   /**
    * 初始化customers数组的构造器
    * totalCustomer：指定数组的长度
    */
   public CustomerList(int totalCustomer) {
      customers = new Customer[totalCustomer];
   }

   /**
    * 将指定客户添加到数组中
    * return ture 添加成功 false 添加失败
    */
   public boolean addCustomer(Customer customer) {
     if(total >= customers.length){
        return false;
     }else{
        customers[total] = customer;
        total++;
        return true;
     }
   }


   /**
    * 修改指定位置上的客户信息
    */
   public boolean replaceCustomer(int index, Customer cust){
      if(index < 0 || index >= 3){
         return false;
      }else{
         customers[index] = cust;//把index上的customers信息改为新cust
         return true;
      }
   }
   /**
    * 删除指定位置（index）上的客户
    */
   public boolean deleteCustomer(int index){
      if(index < 0 || index >= total){
         return false;
      }else{
         for(int i = index; i < total - 1; i++){
            customers[i] = customers[i + 1];
         }
      }
      //最后有数据的元素要置空
      customers[total - 1] = null;
      total --;
      return true;
   }

   /**
    * 获取所有的客户信息
    */
   public Customer[] getAllCustomer(){
      Customer[] custs = new Customer[total];
      for(int i = 0; i < total; i++){
         custs[i] = customers[i];
      }
      return custs;//返回custs数组
   }

   /**
    * 获取指定索引位置上的客户 index
    */
   public Customer getCustomer(int index){
      if(index < 0 || index >= total){
         return null;
      }else{
         return customers[index];
      }
   }

   /**
    * 获取客户的数量
    */
   public int getTotal(){
      return total;
   }

}

