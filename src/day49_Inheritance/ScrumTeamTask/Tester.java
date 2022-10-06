package day49_Inheritance.ScrumTeamTask;
/*
	create a subclass of Employee called Tester
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle

                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
public class Tester extends Employee {

    public Tester(String name, int age, char gender, double salary, int ID, String jobTitle){
        setEmployeeInfo(name,age,gender,salary,ID,jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name+" is running smoke test, while drinking coffee!");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }

}
