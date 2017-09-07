package com.company;
import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            Scanner ab= new Scanner(System.in);
            System.out.println("the number is");
            int n;
            int s=0;
            n=ab.nextInt();
            //s=ab.nextInt();

            for(int i=0; i<=n;i++)
                s= s+i ;
            System.out.println(s);
        }
    }



