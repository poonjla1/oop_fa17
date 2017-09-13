package com.company;

import java.util.Scanner;

public class CircleTesting {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = scanner.nextFloat();
        Circle c = new Circle(r);
        System.out.println("Enter output you want:  'A' for area    'C' for circumference    'D' for diameter: ");
        String req = scanner.next();

        double area = c.getArea();
        double circumference = (2*3.14159265*r);
        double diameter = 2*r;

        if(req.equalsIgnoreCase(("A")))
            System.out.println("area of circle with radius "+r+" is "+area);

        else if(req.equalsIgnoreCase("C"))
            System.out.println("circumference of circle with radius "+r+" is "+circumference);

        else if(req.equalsIgnoreCase("D"))
            System.out.println("diameter of circle with radius "+r+" is "+diameter);
        else
            System.out.println("Error");

    }
}