package com.zc.t06.z01extract_method;

import java.util.Enumeration;
import java.util.Vector;

public class Order
{
    void printOwing(Vector orders){
        Enumeration e=orders.elements();
        double outstanding = 0.0;
        
        //print banner 打印横幅
        System.out.println("*******************");
        System.out.println("***Customer Owes***");
        System.out.println("*******************");
        
        //calculate outstanding
        while(e.hasMoreElements()){
            Order each=(Order) e.nextElement();
            outstanding+=each.getAmount();
        }
        
        //print details
        System.out.println("name:"+name);
        System.out.println("amount"+outstanding);
    }
    private int amount;
    private String name;
    public int getAmount(){
        return amount;
    }
}

