package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        System.out.println("insert integer 1");
        int a=xyz.nextInt();
        System.out.println("insert integer 2 ");
        int b=xyz.nextInt();
        Summation obj=new Summation(a,b);
        int s=obj.total(a,b);
        System.out.println("the total sum is "+s);
    }}



