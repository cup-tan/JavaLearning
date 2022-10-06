package day12_Switch_Scanner;
//  2. write a program that can ask user to enter two number, and the prints the sum of those two number
//            Enter your first number
//            10
//            Enter your second number
//            20
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number");;
        int a = scan.nextInt();

        System.out.println("enter your second number");
        int b = scan.nextInt();


        int sum = a + b;
        System.out.println("sum of those two numbers are: " + sum );

    }

}
