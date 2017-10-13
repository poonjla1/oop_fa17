package com.company;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point a,Point b,Point c) {
        this.vertex1=a;
        this.vertex2=b;
        this.vertex3=c;

    }
    public String toString(){
        return "My Triangle [ V1= "+vertex1+" , V2= "+vertex2+" V3= "+vertex3+" ]";
    }

    public double getPerimeter(){
        double gh=vertex1.distance(vertex2)+vertex1.distance(vertex3)+vertex2.distance(vertex3);
        return gh;
    }

    public String getType(){
        if(vertex1.distance(vertex2)==vertex1.distance(vertex3)&&vertex1.distance(vertex3)==vertex2.distance(vertex3)&&vertex1.distance(vertex2)==vertex2.distance(vertex3))
            return "EQUILATERAL";
        else if(vertex1.distance(vertex2)==vertex1.distance(vertex3)||vertex1.distance(vertex3)==vertex2.distance(vertex3)||vertex1.distance(vertex2)==vertex2.distance(vertex3))
            return "ISOSCELES";
        else
            return "SCALENE";
    }
}




