package com.zc.t07.z01move_method.after;
//账户类
public class Account
{
    //账户类型  类
    private AccountType type;
    private int daysOverdraw;
    
    
    double bankCharge()
    {
        double result=4.5;
        if(daysOverdraw>0)
        {
            result+=type.overdraftCharge(daysOverdraw);
        }
        return result;
    }
}
