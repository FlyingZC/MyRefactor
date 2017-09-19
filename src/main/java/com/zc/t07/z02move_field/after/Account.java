package com.zc.t07.z02move_field.after;
//账户类
public class Account
{
    //账户类型  类
    private AccountType type;
    //1.将表示利率的interestRate搬移到AccountType类中
    double interestForAmountDays(double amount,int days)
    {
        //2.2修改interestRate的引用
        return type.getInterestRate()*amount*days/365;
    }
}
