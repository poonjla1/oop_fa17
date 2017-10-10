package com.company;

public class SalariedEmployee extends Employee {

    private double Salary,r;


    public SalariedEmployee(String x,String y,Double z){
        super(x,y);
        this.Salary=z;

    }


    public double Earnings(double Salary,int y){
        Salary=Salary*32;
        return Salary;
    }
    public double getSalary(){
        return Salary;
    }

    public void Displaydetails(SalariedEmployee c){
        System.out.println(" Name "+this.getName()+" NIC number "+this.getNIC()+"Earnings "+this.getSalary());

    }

}



