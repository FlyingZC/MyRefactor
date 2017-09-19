package com.zc.t01.factor;
//租赁
public class Rental
{
    private Movie movie;
    //租赁时间
    private int daysRented;
    public Rental(Movie movie, int daysRented)
    {
        super();
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public Movie getMovie()
    {
        return movie;
    }
    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }
    public int getDaysRented()
    {
        return daysRented;
    }
    public void setDaysRented(int daysRented)
    {
        this.daysRented = daysRented;
    }
    @Override
    public String toString()
    {
        return "Rental [movie=" + movie + ", daysRented=" + daysRented + "]";
    }
    
    public double getCharge()//factor0302:无需再传本类型参数 .更改该函数名
    {
        double thisAmount =0;
        switch(getMovie().getPriceCode()){//每个电影的价格
            //若是Regular电影,两天以下2元.两天以上每天*1.5
            //2.getPriceCode 该电影的价格
            //3.getDaysRented 租赁的天数
            case Movie.REGULAR:
                thisAmount+=2;
                if(getDaysRented()>2){//租赁天数
                    thisAmount+=(getDaysRented()-2)*1.5;
                }
                break;
            //release电影价格   
            case Movie.NEW_RELEASE:
                thisAmount+=getDaysRented()*3;
                break;
            case Movie.CHILDERNS:
                thisAmount+=1.5;
                if(getDaysRented()>3){
                    thisAmount+=(getDaysRented()-3)*1.5;
                }
                break;
        }
        return thisAmount;
    }
    
}
