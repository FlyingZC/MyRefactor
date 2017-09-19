package com.zc.t01.factor;

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
            //factor01
            /*amoutFor(each);*/
            //factor0402
            each.getCharge();
        }
        
        //
        frequentRenterPoints++;
        
        return null;
    }
    //factor01 不变参数做参数.改变参数做返回值(一个,注意返回值类型)
    //factor02 将参数名 each改为aRental
    //factor03 amoutFor方法未使用到当前类Customer的信息.而使用了rental.所以移动到Rental类中
    /*private double amoutFor(Rental aRental)
    {
        double thisAmount =0;
        switch(aRental.getMovie().getPriceCode()){//每个电影的价格
            //若是Regular电影,两天以下2元.两天以上每天*1.5
            //2.getPriceCode 该电影的价格
            //3.getDaysRented 租赁的天数
            case Movie.REGULAR:
                thisAmount+=2;
                if(aRental.getDaysRented()>2){//租赁天数
                    thisAmount+=(aRental.getDaysRented()-2)*1.5;
                }
                break;
            //release电影价格   
            case Movie.NEW_RELEASE:
                thisAmount+=aRental.getDaysRented()*3;
                break;
            case Movie.CHILDERNS:
                thisAmount+=1.5;
                if(aRental.getDaysRented()>3){
                    thisAmount+=(aRental.getDaysRented()-3)*1.5;
                }
                break;
        }
        return thisAmount;
    }*/
    //factor0303:调用
    //factor04:只有一处调用了该函数.简化调
    /*private double amountFor(Rental aRental){
        return aRental.getCharge();
    }*/
}
