package day13_Scanner;
/*
 1. write a program that can calculate the state tax, federal tax and salary after tax
                needed information:
                                annual salary
                                state tax rate
                                federal tax rate
 */

import java.util.Scanner;  //syntax
public class SalaryAfterTax {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        System.out.println("enter your annual salary: ");
        int salary = input.nextInt();

        System.out.println("enter your state tax rate: ");
        double stateTaxRate = input.nextDouble();// 0.08

        double stateTax = salary * stateTaxRate;

        System.out.println("enter your federal tax rate: ");
        double federalTaxRate = input.nextDouble();// 0.2

        double federalTax = salary * federalTaxRate;


        double salaryAfterTax = salary - stateTax - federalTax;
        System.out.println("your annual salary: $" +salary);
        System.out.println("your state tax: $" +stateTax);
        System.out.println("your federal tax: $" +federalTax);
        System.out.println("your salary after tax: $" +salaryAfterTax);









    }


}
