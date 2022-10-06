package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
2. create a sub class of Employee named Tester(meant to be subClass ONLY)
 */
public final class Tester extends Employee { // Tester can not be super class, can only be sub class

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary); // we can call the super class in constructor with super keyword
    }

    public void findBug(){
        System.out.println(name+" found a bug");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", DOfB: "+
               DOfB+", Job title: "+jobTitle+"Salary: "+salary;
    }

}
