package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        System.out.println("insert integer 1");
        int x=xyz.nextInt();
        System.out.println("insert integer 2 ");
        int y=xyz.nextInt();
        Multiplication m=new Multiplication(x,y);
        int c=m.total(x,y);
        System.out.println("the total sum is "+c);
    }




}
