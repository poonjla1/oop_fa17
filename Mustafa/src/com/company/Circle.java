package com.company;

public class Circle {

    private static float PI = 3.14159265f;
    float r;
    public Circle(float r) {
        this.r=r;

    }
    public double getArea() {
        return  PI*r*r;
    }

    public double getcircumference(){
        return (2*PI*r);
    }

    public double getdiameter(){
        return 2*r;
    }
}



