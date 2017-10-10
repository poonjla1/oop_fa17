package com.company;

public class Main {

    public static void main(String[] args) {
	    UnderGrad[] Ug=new UnderGrad[5];
	    Ug[0]=new UnderGrad("Ali",65);
	    Ug[1]=new UnderGrad("Ahmed",75);
	    Ug[2]=new UnderGrad("zain",52);
        Ug[3]=new UnderGrad("adil",88);
        Ug[4]=new UnderGrad("zohaib",41);
        System.out.println("names\t"+"grade");
        for (int i=0;i<5;i++){
            Ug[i].ComGrade(Ug[i]);
            System.out.println(Ug[i].getName()+" \t "+Ug[i].getGrade());
        }

    }
}