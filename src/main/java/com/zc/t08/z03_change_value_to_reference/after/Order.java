package com.zc.t08.z03_change_value_to_reference.after;
public class Order
{//1.Order引用Customer
    private Customer customer;
    //2.2在创建Customer对象时,使用其工厂方法
    public Order(String customerName)
    {
        customer=Customer.getNamedCustomer(customerName);
    }

    public String getCustomer()
    {
        return customer.getName();
    }

    public void setCustomer(String customer)
    {
        this.customer=Customer.getNamedCustomer(customer);
    }
    
}
