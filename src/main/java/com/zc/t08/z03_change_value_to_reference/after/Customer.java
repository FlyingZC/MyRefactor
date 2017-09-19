package com.zc.t08.z03_change_value_to_reference.after;

import java.util.HashMap;

public class Customer
{
    private String name;
    //2.4对象字典
    private static HashMap<String,Customer> instanceDict=new HashMap<String,Customer>();
    
    //2.5向字典中存储预定义的对象
    public static void storeCustomers()
    {
        instanceDict.put("za",new Customer("za"));
        instanceDict.put("zb",new Customer("zb"));
        instanceDict.put("zc",new Customer("zc"));
        instanceDict.put("zd",new Customer("zd"));
    }
    
    //2.6加载字典中的对象
    public static Customer loadCustomer(String name)
    {
        return instanceDict.get(name);
    }
    
    //2.3构造方法私有
    private Customer(String customerName)
    {
        this.name=customerName;
    }

    //2.1建立工厂方法
    //2.7修改工厂方法,返回字典中的对象
    //2.8重构该工厂方法名
    public static Customer getNamedCustomer(String customerName)
    {
        //return new Customer(customerName);
        if(!instanceDict.containsKey(customerName))
        {
            instanceDict.put(customerName, new Customer(customerName));
        }
        return instanceDict.get(customerName);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
}
