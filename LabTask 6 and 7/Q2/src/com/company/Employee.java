package com.company;

abstract  public class Employee {

    private String Name;
    private String NIC;

    public Employee(String name, String NIC) {
        this.Name = name;
        this.NIC = NIC;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    abstract public double Earnings(double x,int y);


    public void Displaydetails(SalariedEmployee c) {

    }
    public void Displaydetails(HourlyEmployee c) {
    }

}


