package com.company;
import java.io.IOException;
import java.util.Scanner;



public class SlotMachine {
    public static final int INITIAL_CREDITS = 10; // a "constant" for the amount of credit a slot machines gives the user to start off

    // INSTANCE PROPERTIES HERE
    Dial[]dials=new Dial[3];

    int credit;
    public SlotMachine(){
        // initialize instance properties
        credit = INITIAL_CREDITS;
        for (int i = 0; i < 3; i++) {
            dials[i] = new Dial();
        }
    }

    // INSTANCE METHODS HERE
    public int getBet() {

        Scanner scanner = new Scanner(System.in);

        // prompt the user for a bet and save the input to a variable
        System.out.println(" enter bet amount (or a negative number to quit): ");
        String Bet = scanner.next();

        // convert the String to the int value
        int intBet = Integer.parseInt(Bet);

        return intBet;
    }

 public static void main(String[] args) throws IOException {
        // declare a variable and assign it a new instance of a SlotMachine
 SlotMachine machine = new SlotMachine();

 int bet; // for the current bet value from the user

 // Welcome message
 System.out.println("Welcome to the Slot Machine!!!\nYou have " + machine.credit + " credits.\n");

 //ADD CODE to call the getBet method on mySlot
 bet = machine.getBet();

 machine.pullLever();
//        mySlot.readSlot();
 System.out.println(machine.readSlot());
 bet = machine.computeWinnings(bet);

 System.out.println("Remaing credits: " + bet);

 }

 public void pullLever() {
 for (int i = 0; i < 3; i++) {
 dials[i].spin();
 }
 }

 public String readSlot() {
 String pic = "";
 for (int i = 0; i < 3; i++) {
     pic = pic + dials[i].getPicture();
 }
     return pic;
 }


    public int computeWinnings(int bet) {
        if (dials[0].getValue() == dials[1].getValue() && dials[0].getValue() == dials[2].getValue() && dials[1].getValue() == dials[2].getValue()) {
            return bet;
        } else if (dials[0].getValue() == dials[1].getValue() || dials[0].getValue() == dials[2].getValue() || dials[1].getValue() == dials[2].getValue()) {
            return 0;
        } else {
            return INITIAL_CREDITS - bet;
        }
    }

}



