package com.company;


public class Queue {

    public static void main(String[] args) {

        Queue1 qu1 = new Queue1(5); //First Constructor Called

        Queue1 qu2 = new Queue1(qu1); //Second Constructor Called

        char[] ch = {'b','c','d','e','b'};

        Queue1 qu3 = new Queue1(qu1,ch); //Third Constructor Called
    }

}