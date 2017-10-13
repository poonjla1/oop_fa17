package com.company;

public class Circle implements Movable,GeoObj{
    private double radius;
    public Circle(double x){
        this.radius=x;
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
