package com.company;
import java.util.Scanner;
public class QueueTest {
        Queue quee;
        Scanner scanner = new Scanner(System.in);
        public static void main(String args[]) {

            QueueTest demo = new QueueTest();

            demo.attempt();

        }
        public void attempt() {

            quee = new Queue(10);

            System.out.println("Enter a character to start array:  ");

            String i = scanner.next();

            if(i.length() > 1) {

                System.out.println("This is not the character");

                System.exit(0);

            } else {

                quee.put(i.charAt(0));





        }




    }

}
