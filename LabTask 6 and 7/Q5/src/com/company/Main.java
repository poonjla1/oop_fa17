package com.company;

public class Main {

    public static void main(String[] args) {
        Author A=new Author("Alan","alan_@hotmail.com");
        Book B=new Book("Something special ",400,A);
        System.out.println(B);
    }
    }

