package com.zc.t01.factor;

public class Movie
{
    //儿童片
    public static final int CHILDERNS = 2;
    //普通片
    public static final int REGULAR = 0;
    //新片
    public static final int NEW_RELEASE = 1;
    //片名
    private String title;
    //价格
    private int priceCode;
    public Movie(String title, int priceCode)
    {
        super();
        this.title = title;
        this.priceCode = priceCode;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getPriceCode()
    {
        return priceCode;
    }
    public void setPriceCode(int priceCode)
    {
        this.priceCode = priceCode;
    }
    public static int getChilderns()
    {
        return CHILDERNS;
    }
    public static int getRegular()
    {
        return REGULAR;
    }
    public static int getNewRelease()
    {
        return NEW_RELEASE;
    }
    @Override
    public String toString()
    {
        return "Movie [title=" + title + ", priceCode=" + priceCode + "]";
    }
    
}
