package com.zc.t07.z03_extract_class.before;

public class Person
{
    private String name;
    private String officeAreaCode;
    //1.将电话号码相关的行为 分离到一个独立的类中
    private String officeNumber;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getOfficeAreaCode()
    {
        return officeAreaCode;
    }
    public void setOfficeAreaCode(String officeAreaCode)
    {
        this.officeAreaCode = officeAreaCode;
    }
    public String getOfficeNumber()
    {
        return officeNumber;
    }
    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }
    
}
