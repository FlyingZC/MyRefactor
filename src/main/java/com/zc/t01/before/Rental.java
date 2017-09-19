package com.zc.t01.before;
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
    
}
