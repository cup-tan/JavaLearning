package day13_Scanner;
import java.util.Scanner;
public class Scanner_NextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// 120000Enter scanner had a memory 120000 and enter so all of them will print
        System.out.println("enter your salary: ");
        int salary = scan.nextInt();

        scan.nextLine();// use this to take out the enters that are left in the scanner so that we can use the next line method.
        System.out.println("enter your full name: ");
        String fullName = scan.nextLine();//enter// that is the bug disadvantage

        System.out.println("salary: " + salary );
        System.out.println("fullname: " + fullName);






    }
}
