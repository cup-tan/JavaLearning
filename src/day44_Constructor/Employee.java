package day44_Constructor;
/*
 1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender

            static variables:
            		isEmployed, hasSalary

            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
 */
public class Employee {

    String name;
    int ID;
    int SSN;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {// runs first, only one time
        isEmployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name, int ID, int SSN, String jobTitle, double salary, char gender){
        this.name = name;
        this.ID = ID;
        this.SSN = SSN;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+ID+"\nSSN: "+SSN+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary;
    }











}
