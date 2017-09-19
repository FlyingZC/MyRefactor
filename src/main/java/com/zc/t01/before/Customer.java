package com.zc.t01.before;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//顾客
public class Customer
{
    private String name;
    //一个顾客 多个 租赁 .一个租赁 对应 一个电影和天数
    private List<Rental> rentals=new ArrayList<Rental>();
    public Customer(String name)
    {
        super();
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<Rental> getRentals()
    {
        return rentals;
    }
    public void setRentals(List<Rental> rentals)
    {
        this.rentals = rentals;
    }
    @Override
    public String toString()
    {
        return "Customer [name=" + name + ", rentals=" + rentals + "]";
    } 
    
    //生成详细订单的方法
    public String statement(){
        //1.getMovie 要租赁的电影
        
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        
        Iterator<Rental> it=rentals.iterator();
        while(it.hasNext()){
            double thisAmount=0;//iterator中单个Rental(租赁)的价格
            Rental each=it.next();
            
            switch(each.getMovie().getPriceCode()){//每个电影的价格
                //若是Regular电影,两天以下2元.两天以上每天*1.5
                //2.getPriceCode 该电影的价格
                //3.getDaysRented 租赁的天数
                case Movie.REGULAR:
                    thisAmount+=2;
                    if(each.getDaysRented()>2){//租赁天数
                        thisAmount+=(each.getDaysRented()-2)*1.5;
                    }
                    break;
                //release电影价格   
                case Movie.NEW_RELEASE:
                    thisAmount+=each.getDaysRented()*3;
                    break;
                case Movie.CHILDERNS:
                    thisAmount+=1.5;
                    if(each.getDaysRented()>3){
                        thisAmount+=(each.getDaysRented()-3)*1.5;
                    }
                    break;
            }
        }
        
        //
        frequentRenterPoints++;
        
        return null;
    }
}
