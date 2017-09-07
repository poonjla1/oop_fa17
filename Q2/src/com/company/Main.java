package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                Scanner ab=new Scanner(System.in);
                System.out.println("enter number for factorial");
                int n;
                        int fact=1;
                n=ab.nextInt();
                if(n<0)
                    System.out.println("non negative number");
                else
                for(int i=1;i<=n;i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of "+n+" is: "+fact);
            }
        }



