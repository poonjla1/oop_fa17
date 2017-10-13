package com.company;

public class Main {

    public static void main(String[] args) {
            Point a=new Point(0,0);
            Point b=new Point(0,2);
            Point c=new Point(0,3);
            a.distance(b);
            a.distance(c);
            c.distance(b);
            Triangle T=new Triangle(a,b,c);
            System.out.println(T);
            System.out.println("the Perimeter of Triangle is " +T.getPerimeter()+ " and the triangle is "+T.getType());
        }
    }


