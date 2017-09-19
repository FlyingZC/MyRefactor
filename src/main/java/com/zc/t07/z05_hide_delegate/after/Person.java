package com.zc.t07.z05_hide_delegate.after;

public class Person
{
    Department department;
    public Department getDepartment()
    {
        return department;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
    }
    //2.1建立委托函数
    public Person getManager()
    {
        return department.getManager();
    }
}
