package com.company;

public class Main {

    // write your code here
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) <  0)
            max = y;
        if (z.compareTo(max) < 0)
            max = z;
        return max;
    }
    static <T> T sum(T x, T y, T z, Summer<T> summer) {
        T answer = summer.sum(x,y);
        answer=summer.sum(answer,z);

        return answer;
    }






    public static void main(String[] args) {
        System.out.println("maximum of 3,4,5 is "+maximum(3,4,5));
        System.out.println("minimum of 3,4,5 is "+minimum(3,4,5));

        System.out.println("sum of 3,4,5 is "+sum(3,4,5, new Summer<Integer>(){

@Override
public Integer sum(Integer a, Integer b) {

        return a+b;
        }
        }));

        System.out.println("sum of strings is "+sum("ab","cd","ef", new Summer<String>() {

            @Override
            public String sum(String a, String b) {
                return a + b;
            }
        }));
    }
}