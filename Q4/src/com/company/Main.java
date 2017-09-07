package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");
        /**
         * These are the varaibles that are used in the programs.
         * User shall be asked to input the value for all except time
         */
        int inst1 =1;
        int inst2 =2;
        int inst3 =3;
        int instnum;
        int numinst;
        double cyclecount;
        double rate;
        double time;
        double sec;
        System.out.println(" Enter \" 1 \" For instruction of Set 1");
        System.out.println(" Enter \" 2 \" For instruction of Set 2");
        System.out.println(" Enter \" 3 \" to end ");
/**
 * This is do-while loop to reinitiate a loop until a particuler command is recieved to end the program.
 * It will automatically end when it will recieve command number 3
 * For the rest it will run uninteruptedly without the need of re initiating the program.
 */
        do {
            System.out.println("Enter the Number");
            instnum = in.nextInt();
            if(instnum == 1){
                System.out.println("Enter the number ");
                numinst = in.nextInt();
                System.out.println("Enter the cycle count");
                cyclecount = in.nextDouble();
                System.out.println("Enter the Rate (Mhz)");
                rate = 1/(in.nextDouble()* 1000000);
                time =( numinst * cyclecount * rate);
                System.out.println("time required is: " + time + " Seconds");
            }
            else if(instnum ==2){
                System.out.println("Enter the number ");
                numinst = in.nextInt();
                System.out.println("Enter the seconds required per instruction");
                sec = in.nextDouble();
                time = (sec * numinst);
                System.out.println("The time required is: " + time + " Seconds");
            }
            else{}

        }
        while ( instnum != 3);




    }
}

