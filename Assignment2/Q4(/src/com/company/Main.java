package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            for(;;){
                Scanner xyz=new Scanner(System.in);
                CPUTimer obj;
                System.out.println(" choose 1 choice out of 3 given :[x,y,z]");
                char ch=xyz.next().charAt(0);
                if(ch=='x') {
                    System.out.println("Insert your instruction count #");
                    int x = xyz.nextInt();
                    System.out.println("how many Cycles per instruction");
                    int y = xyz.nextInt();
                    System.out.println("Clock Speed in MHz");
                    int z = xyz.nextInt();
                    obj = new CPUTimer(x, y, z);
                    System.out.println("seconds taken per program are " + obj.getSec());
                }
                else if(ch=='y') {
                    System.out.println("Insert your instruction count#");
                    int x = xyz.nextInt();
                    System.out.println("Insert seconds per instruction");
                    int y = xyz.nextInt();
                    obj = new CPUTimer(x, y);
                    System.out.println("seconds taken per program are " + obj.getSec());
                }
                else if(ch=='z'){
                    System.exit(0);

                }
                System.out.println("want to return program  yes or no");
                char A=xyz.next().charAt(0);
                if(A=='n'){
                    System.exit(0);
                }


            }

        }}


