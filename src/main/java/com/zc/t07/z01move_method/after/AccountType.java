package com.zc.t07.z01move_method.after;
//账户类型 类
public class AccountType
{
    /** <一句话功能简述>1.透支金额计费规则,每种账户都有不同的overdraftCharge,考虑搬移此方法
     * <功能详细描述>2.将方法搬移到此,
     * @return
     * @see [类、类#方法、类#成员]
     */
    double overdraftCharge(int daysOverdraw)//2.1添加传入的参数
    {
        if(isPremium())
        {
            double result=10;
          //1.1由于daysOverdraw属性与AccountType无关,所以重构时,将该属性保留在当前方法中
            if(daysOverdraw>7)
            {
                result+=(daysOverdraw-7)*0.85;
            }
            return result;
        }
        else
        {
            return daysOverdraw*1.75;
        }
    }

    public boolean isPremium()
    {
        return false;
    }

}
