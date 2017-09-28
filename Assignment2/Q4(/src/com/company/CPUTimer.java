package com.company;

public class CPUTimer {

    private int IC;
    private Double IPS;

    public CPUTimer(int Ic, int cyclesPERins, int cyclesPERsec){
        this.IC=Ic;
        this.IPS=(double)cyclesPERsec*1000000;
        IPS=IPS/cyclesPERins;
    }

    public CPUTimer(int iC,int InsPS){
        this.IC=iC;
        this.IPS=(double)InsPS;
    }

    // returns the instruction count as stored in the object
    int getIC(){
        return IC;
    }
    // returns the  instruction per sec(IPS)
    double getSPI(){
        double x=1/IPS;
        return x;
    }

    // returns the seconds per program
    double getSec(){

        return IC*getSPI();
    }

}



