package com.zc.t10.z04_separater_query_from_modifier.before;

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

    String foundMiscreant(String[] people)
    {
        for(int i=0;i<people.length;i++)
        {
           if(people[i].equals("Don"))
           {
               sendAlert();
               return "Don";
           }
           if(people[i].equals("John"))
           {
               sendAlert();
               return "John";
           }
        }
        return "";
    }

    private void sendAlert()
    {
        // TODO Auto-generated method stub
        
    }
}
