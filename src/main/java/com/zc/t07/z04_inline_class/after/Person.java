package com.zc.t07.z04_inline_class.after;

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
    //2.1在Person类中 声明TelephoneNumber类中的所有public方法
    public String getOfficeNumber()
    {//2.1.1将其中的return officeNum.改为return officeTelephone.getOfficeNumber();
        return officeTelephone.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber)
    {
        this.officeTelephone.setOfficeNumber(officeNumber);
    }
    
    public String getOfficeAreaCode()
    {
        return officeTelephone.getOfficeAreaCode();
    }
    public void setOfficeAreaCode(String officeAreaCode)
    {
        this.officeTelephone.setOfficeAreaCode(officeAreaCode);;
    }
}
