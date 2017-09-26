package com.company;
public class Queue {

    char q[];

    int getloc, putloc;




    public Queue(int size) {

        q=new char[size];

        putloc = -1;

    }
    public char get(){

        if(putloc == -1){

            System.out.println("Your array is empty");

            return 0;

        }

        return q[putloc];

    }

    public void put(char c) {

        if(putloc == 9) {

            System.out.println(" maximum capacity reached");

            return;

        }

        q[putloc=putloc+1]=c;

    }

}

