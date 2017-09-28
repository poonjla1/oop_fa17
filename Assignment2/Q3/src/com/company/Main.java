package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        System.out.println("Insert your table number ");
        int a=xyz.nextInt();
        ModulusTable obj=new ModulusTable(a,12);
        System.out.println("  "+"1"+" "+"2"+" "+"3"+" "+"4"+" "+"5"+" "+"6"+" "+"7"+" "+"8"+" "+"9"+" "+"10"+" "+"11"+" "+"12");
        for(int j=1;j<13;j++){
            System.out.print(j+" ");
            for(int i=1;i<13;i++){

                System.out.print(obj.toString(i,a,j)+" ");
            }
            System.out.println();
        }
    }
}

