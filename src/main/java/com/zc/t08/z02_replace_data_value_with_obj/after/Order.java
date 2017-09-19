package com.zc.t08.z02_replace_data_value_with_obj.after;
//以对象 取代 数据值.(将一个字段变为对象)
public class Order
{//2.2替换掉该字段
    //private String customer;
    private Customer customer;

    public String getCustomer()
    {
        //return customer;
        return customer.getName();
    }

    public void setCustomer(String customer)
    {
        //this.customer = customer;
        this.customer=new Customer();
        this.customer.setName(customer);
    }
    
}
