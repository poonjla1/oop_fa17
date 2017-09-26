package com.company;

public class Queue1{

    char que[];
    int getloc, putloc;

    Queue1 quCopy;

    public Queue1(int size) {
        que=new char[size];
        putloc = -1;
    }

    public Queue1(Queue1 qu) {
        quCopy = qu;
    }

    public Queue1(Queue1 qu, char q[]) {
        for (int i = 0; i < q.length; i++) {
            qu.put(q[i]);
        }
    }

    public char get(){
        if(putloc == -1){
            System.out.println("Your array is empty");
            return 0;
        }
        return que[putloc];
    }

    public void put(char c) {
        if(putloc == 9) {
            System.out.println("You have reached the maximum capacity");
            return;
        }
        que[putloc=putloc+1]=c;
    }
}