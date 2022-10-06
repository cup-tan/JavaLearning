package day04_Variables;
/*declare the following variables:
         employeeName : String
         employeeID   : int
         jobTitle     : String
         salary       : double
         gender(char) : char
         isFullTime (boolean) : boolean */

public class Variables3 {
    public static void main(String[] args) {
        // school name : Cybertek School
        String schoolName = "Cybertek School";
        System.out.println(schoolName); // what if school name updated
                          // variable name
        System.out.println("====================================");

        String employeeName = "Asli"; // "employee Name:" + employeeName
        int employeeID = 588888;
        String jobTitle ="SDET";
        double salary = 120_00.50;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("employee Name: " + employeeName);
        System.out.println("employeeID: " + employeeID);
        System.out.println("jobTitle: " + jobTitle);
        System.out.println("salary: " + salary +" USD");
        System.out.println("gender: " + gender);
        System.out.println("Full Time: " + isFullTime);




    }
}
