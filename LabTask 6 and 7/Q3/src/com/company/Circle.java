package com.company;

public class Circle implements GeometeryObject,Movable {

    private double radius;
    public Circle(double a){
        this.radius=a;
    }

    @Override
    public double getArea() {
        return 3.142*3.142*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.142*radius;
    }

    @Override
    public void moveup() {

    }

    @Override
    public void movedown() {

    }

    @Override
    public void moveright() {

    }

    @Override
    public void moveleft() {

    }
}


