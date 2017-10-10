package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner xyz = new Scanner(System.in);

        String name, NIC;
        double Salary, Wage;
        int hours;
        Employee[] array =new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("select one \n a)SalariedEmployee b)HourlyEmployee");
            char A = xyz.next().charAt(0);
            if (A == 'a') {
                System.out.println("Enter your name, NIC number and WeeklySalary ");
                name = xyz.next();
                NIC = xyz.next();
                Salary = xyz.nextDouble();

                array[i] = new SalariedEmployee(name, NIC, Salary);
                array[i].Earnings(Salary,32);
                array[i].Displaydetails((SalariedEmployee) array[i]);

            }
            else if (A == 'b') {
                System.out.println("Enter your name, NIC number and WeeklySalary and hours done");
                name = xyz.next();
                NIC = xyz.next();
                Wage = xyz.nextDouble();
                hours = xyz.nextInt();
                array[i] = new HourlyEmployee(name, NIC, Wage, hours);
                array[i].Earnings(Wage,hours);
                array[i].Displaydetails((HourlyEmployee)array[i]);

            }
        }
    }}




