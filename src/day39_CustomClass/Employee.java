package day39_CustomClass;

public class Employee {
    /*
    Employees:
	Attributes:
		employeeName, gender, SSN, JobTitle, Salary

	Actions:
		attendMeeting, Working, getInfo, SetInfo
     */

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;


    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSN, String employeeJobTitle, double  employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+" Gender: "+gender+", JobTitle: "+jobTitle+ ", Salary: "+salary);
       String ssn = SSN;
        System.out.println("Last four digits of SSN: "+ ssn.substring(ssn.length()-4)  );
    }



}
