package com.company;

public class HourlyEmployee extends Employee {

    private int Hours;
    private double Wage,x;


    public HourlyEmployee(String x,String y,Double z,int a){
        super(x,y);
        this.Wage=z;
        this.Hours=a;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public Double getWage() {
        return Wage;
    }

    public void setWage(Double wage) {
        Wage = wage;
    }



    public double Earnings(double Wage, int hours) {
        if (hours < 40) {
            x = Wage * hours;
        } else {
            x = 40 * Wage + (hours - 40) * Wage * 1.5;
        }
        return x;}

    public double getEarnings(){
        return x;
    }

    public void Displaydetails(HourlyEmployee c){
        System.out.println("Name "+this.getName()+" NIC "+this.getNIC()+" Hourly Wage "+this.getWage()+" Hours Worked "+this.getHours()+" Earnings "+this.getEarnings());

    }



}


