package com.zc.t08.z03_change_value_to_reference.before;
public class Order
{//1.Order引用Customer
    private Customer customer;

    public String getCustomer()
    {
        return customer.getName();
    }

    public void setCustomer(String customer)
    {
        this.customer=new Customer();
        this.customer.setName(customer);
    }
    
}
