package iobasics;


public class Date {

    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date dt){
        this.day = dt.day;
        this.month = dt.month;
        this.year = dt.year;
    }


    public void setYear(int year){
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return day+ "/" + month + "/" + year+ "\n";
    }

    public void display(){
        System.out.println(this.toString());
    }
    

}
