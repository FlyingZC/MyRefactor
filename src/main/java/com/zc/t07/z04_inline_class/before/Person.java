package com.zc.t07.z04_inline_class.before;

public class Person
{//1.现在要将TelephoneNumber重新inline到当前类中,删除TelephoneNumber类
    private String name;
    private TelephoneNumber officeTelephone=new TelephoneNumber();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public TelephoneNumber getOfficeTelephone()
    {
        return officeTelephone;
    }
    public void setOfficeTelephone(TelephoneNumber officeTelephone)
    {
        this.officeTelephone = officeTelephone;
    }
    
}
