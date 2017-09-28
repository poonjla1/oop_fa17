package com.company;

public class ModulusTable {
    private int mod, tablelength;

    public ModulusTable(int mod1,int tableL1) {
        this.mod=mod1;
        this.tablelength=tableL1;
    }

    public String toString(int a,int value,int b){
        return ""+((a*b)%value);
    }
}

