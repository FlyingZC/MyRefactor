package com.zc.t06.z07split_templary_variable;

public class Param
{
    public static void main(String[] args)
    {
        Person p1=new Person(1);//1
        addPersonAge(p1);
        System.out.println("after addMethod age:"+p1.getAge());//2
        
        Person p2=new Person(1);//1
        replaceNewPerson(p2);
        System.out.println("after replaceNewPerson:"+p2);//1
    }


    private static void addPersonAge(Person p1)
    {
        p1.setAge(p1.getAge()+1);
        System.out.println("in addMethod age:"+p1.getAge());//2
    }
    
    private static void replaceNewPerson(Person p2)
    {
        p2=new Person(1+1);
        System.out.println("in replaceNewPerson "+p2);//2
    }
    
}
class Person{
    private int age;

    public Person(int age){
        this.age=age;
    }
    
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person [age=" + age + "]";
    }
    
}