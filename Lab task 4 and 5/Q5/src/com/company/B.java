package com.company;


public class B extends A {


    public B(int i){
        super(i);
        System.out.println("Constructing B ");

    }

}
/*
Making the final variable .
Modifying the constructor to take the int variable for initialization.
 */

class A {
    private final int i;
    public A(){
        i=0;
        System.out.println("Constructing A");
    }
    public A(int i){
        this.i=i;
        System.out.println("Constructing A");
    }
}

class C extends B {
    public C(int i) {
        super(i);
        System.out.println("Constructing C");
    }
}

