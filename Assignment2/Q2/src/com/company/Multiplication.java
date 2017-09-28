package com.company;

public class Multiplication {
    private int i,j;
    public Multiplication(int a,int b){
        this.i=a;
        this.j=b;
    }
    int total(int a,int y) {
        int x = 0;
        int sum = a;
        if (y > a) {
            for (int i = 1; i < (y - a) + 1; i++) {

                x = a + i;
                sum = sum * a;
            }
        }
        else {
            for (int i = 1; i < (a - y) + 1; i++) {
                x = a - i;
                sum = sum * x;
            }
        }
        return sum;

    }
}
