package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
 */

public class Employee extends Person {  //Employee is super class
    /*
    name, age, gender
    getSsn(), setSsn(), sleep(), setPersonInfo(name, age, gender)
    */

    public double salary;
    public int ID;
    public String jobTitle;

   public void setEmployeeInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
       setPersonInfo(name, age, gender);
       this.salary = salary;
       this.ID = ID;
       this.jobTitle = jobTitle;
   }
//  method overloading: sets name, age, gender, salary, ID, jobTitle

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Salary: $"+salary+
                ", Employee ID: "+ID+", Job title: "+jobTitle;
    }





}
