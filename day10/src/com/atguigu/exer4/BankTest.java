package com.atguigu.exer4;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        //连续操作
        bank.getCustomer(0).setAccount(new Account(2000));//拿到0号客户，设置账户信息，新建账户余额为2000元

        bank.getCustomer(0).getAccount().withdraw(500); //拿到0号客户，拿到对应账号，取500块

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);

        System.out.println("**********************************");
        bank.addCustomer("万里","杨");
        System.out.println("银行客户个数为：" + bank.getNumberOfCustomers());
    }
}
