package com.company;

public class Student {
    private String name;
    private int Testscore;
    private String Grade;
public Student(String n,int x) {
    this.name=n;
    this.Testscore=x;
}

    public void setName(String F) {
        name=F;
    }

    public String getName() {
        return name;
    }

    public void setTestscore(int a) {
        Testscore = a;
    }
    public int getTestscore(){
    return Testscore;
    }

    public void setGrade(String G) {
        Grade = G;
    }
    public String getGrade(){
        return Grade;
    }
    public void ComGrade(UnderGrad A){
        if (this.Testscore>70 || this.Testscore==70) {
            this.setGrade("pass");
        } else
            this.setGrade("fail");
        }

    }




