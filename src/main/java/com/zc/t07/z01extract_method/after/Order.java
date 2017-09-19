package com.zc.t07.z01extract_method.after;

import java.util.Enumeration;
import java.util.Vector;

public class Order
{
    Vector orders=new Vector();
    void printOwing(){
        
        //print banner 打印横幅
        //factor0101:重构为无参方法
        printBanner();
        
        //factor03
        //calculate outstanding
        double outstanding = getOutStanding();
        
        //print details
        //factor0201:重构为有参方法,该参数只读取,在方法内不修改
        printDetails(outstanding);
    }
    private double getOutStanding()
    {   //factor0302若局部变量在该函数外不使用,则直接声明在该函数体内
        Enumeration e=orders.elements();
        double outstanding = 0.0;
        while(e.hasMoreElements()){
            Order each=(Order) e.nextElement();
            outstanding+=each.getAmount();
        }
        //若函数体外还使用该函数,则返回该修改的值
        return outstanding;
    }
    //factor0202
    private void printDetails(double outstanding)
    {
        System.out.println("name:"+name);
        System.out.println("amount"+outstanding);
    }
    //factor0102:
    private void printBanner()
    {
        System.out.println("*******************");
        System.out.println("***Customer Owes***");
        System.out.println("*******************");
    }
    private int amount;
    private String name;
    public int getAmount(){
        return amount;
    }
}

