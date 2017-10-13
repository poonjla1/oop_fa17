package com.company;

public class Book {
    private String title;
    private Author a;
    private double price;

    public Book(String T,double P,Author at){
        this.title=T;
        this.price=P;
        this.a=at;
    }

    public String getTitle() {
        return title;
    }

    public Author getAth() {
        return a;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return " Book [ name: "+getTitle()+"  price: "+getPrice()+" "+getAth()+" ]";
    }
}







