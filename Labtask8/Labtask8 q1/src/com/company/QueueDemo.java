package com.company;

import java.util.Scanner;

public class QueueDemo {
    Queue<Integer> que;

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        QueueDemo demo = new QueueDemo();
        demo.doWork();
    }


    public void doWork() {
        que = new Queue<Integer>(10);
        System.out.println("Enter character to add to array:  ");
        String i = scanner.next();
        if(i.length() > 1) {
            System.out.println("The value enetered is not a character");
            System.exit(0);
        } else {
            que.put(Integer.valueOf(i.charAt(0)));
        }

    }
}
