package com.zc.t07.z05_hide_delegate.after;

public class Client
{
    public static void main(String[] args)
    {
        //1.若客户想知道某人的经理是谁,必须先获得Department对象,这样编码就暴露了Department
        //希望对客户隐藏Department,减少耦合
        Person john=new Person();
        //john.getDepartment().getManager();
        //2.2使用新的委托函数
        john.getManager();
    }
}
