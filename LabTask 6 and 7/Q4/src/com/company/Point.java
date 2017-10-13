package com.company;

public class Point {
    private int c,d;


    public Point(int x,int y){
        this.c=c;
        this.d=d;
    }

    public int getX() {
        return c;
    }

    public int getY() {

        return d;
    }

    public double distance(Point a){
        double b= Math.sqrt(Math.pow(a.c-c,2)+Math.pow(a.d-d,2));
        return b;

    }


    public String toString() {
        return "("+c+","+d+")";
    }
}




