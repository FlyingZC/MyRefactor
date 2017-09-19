package com.zc.t07.z05_hide_delegate.before;

public class Department
{
    private String chargeCode;
    private Person manager;
    public String getChargeCode()
    {
        return chargeCode;
    }
    public void setChargeCode(String chargeCode)
    {
        this.chargeCode = chargeCode;
    }
    public Person getManager()
    {
        return manager;
    }
    public void setManager(Person manager)
    {
        this.manager = manager;
    }
    
}
