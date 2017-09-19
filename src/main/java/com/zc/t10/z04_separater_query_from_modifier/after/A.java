package com.zc.t10.z04_separater_query_from_modifier.after;

public class A
{
    void checkSecurity(String[] people)
    {//1.调用foundMiscreant
        String found=foundMiscreant(people);
        someLaterCode(found);
    }
    
    private void someLaterCode(String found)
    {
        
    }
    
    //2.1为了将查询和修改分离,首先建立一个适当的查询函数.使其与修改函数返回相同的值,但是不造成任何副作用
    String foundPerson(String[] people)
    {
        for(int i=0;i<people.length;i++)
        {
           if(people[i].equals("Don"))
           {
               return "Don";
           }
           if(people[i].equals("John"))
           {
               return "John";
           }
        }
        return "";
    }

    String foundMiscreant(String[] people)
    {
        for(int i=0;i<people.length;i++)
        {
           if(people[i].equals("Don"))
           {
               sendAlert();
               //2.2替换所有查询语句为调用 查询函数
               //return "Don";
               return foundPerson(people);
           }
           if(people[i].equals("John"))
           {
               sendAlert();
               //return "John";
               return foundPerson(people);
           }
        }
        return "";
    }

    private void sendAlert()
    {
        // TODO Auto-generated method stub
        
    }
}
