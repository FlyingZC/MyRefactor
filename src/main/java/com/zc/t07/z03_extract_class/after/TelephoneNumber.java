package com.zc.t07.z03_extract_class.after;
//2.1新建TelephoneNumber类
public class TelephoneNumber
{
    //2.3.2
    private String officeNumber;
    private String officeAreaCode;

    public String getOfficeNumber()
    {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }
    
    public String getOfficeAreaCode()
    {
        return officeAreaCode;
    }
    public void setOfficeAreaCode(String officeAreaCode)
    {
        this.officeAreaCode = officeAreaCode;
    }
    
}
