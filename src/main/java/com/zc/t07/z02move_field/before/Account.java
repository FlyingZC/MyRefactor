package com.zc.t07.z02move_field.before;
//账户类
public class Account
{
    //账户类型  类
    private AccountType type;
    //1.将表示利率的interestRate搬移到AccountType类中
    private double interestRate;
    double interestForAmountDays(double amount,int days)
    {
        return interestRate*amount*days/365;
    }
}
