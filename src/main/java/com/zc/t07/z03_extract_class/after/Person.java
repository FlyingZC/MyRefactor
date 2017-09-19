package com.zc.t07.z03_extract_class.after;

public class Person
{
    private String name;
    //private String officeAreaCode;
    //1.将电话号码相关的行为 分离到一个独立的类中
    //2.3使用move field移动该字段
   // private String officeNumber;
    //2.2建立从Person到TelephoneNumber的连接
    //4.按情况,提供getter或setter
    private TelephoneNumber officeTelephone=new TelephoneNumber();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
   /* public String getOfficeAreaCode()
    {
        return officeAreaCode;
    }
    public void setOfficeAreaCode(String officeAreaCode)
    {
        this.officeAreaCode = officeAreaCode;
    }*/
    /*public String getOfficeNumber()
    {   //2.3.3
        return officeTelephone.getOfficeNumber();
    }
    public void setOfficeNumber(String officeNumber)
    {//2.3.4
        officeTelephone.setOfficeNumber(officeNumber);
    }*/
    public TelephoneNumber getOfficeTelephone()
    {
        return officeTelephone;
    }
    public void setOfficeTelephone(TelephoneNumber officeTelephone)
    {
        this.officeTelephone = officeTelephone;
    }
    
}
