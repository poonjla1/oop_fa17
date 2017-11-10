package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue<T> {

    List<T> q;
    int getloc, putloc;

    public Queue(int size) {
        q = new ArrayList<T>(size);
        putloc = -1;
    }

    public T get() {
        if (putloc == -1) {
            System.out.println("Your array is empty");
            return null;
        }
        return q.get(putloc);
    }

    public void put(T c) {
        if (putloc == 9) {
            System.out.println("You have reached the maximum capacity");
            return;
        }
        q.add((putloc = putloc + 1), c);
    }
}


