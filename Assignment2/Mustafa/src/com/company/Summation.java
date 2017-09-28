package com.company;

public class Summation {
    private int i,j;
    public Summation(int a,int b){
        this.i=a;
        this.j=b;
    }
    int total(int e,int f) {
        int c = 0;
        int sum = e;
        if (f > e) {
            for (int i = 1; i < (f - e) + 1; i++) {

                c = e + i;
                sum = sum + c;
            }
        }
        else {
            for (int i = 1; i < (e - f) + 1; i++) {
                c = e - i;
                sum = sum + c;
            }
        }
        return sum;

    }
}
