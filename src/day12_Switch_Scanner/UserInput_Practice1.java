package day12_Switch_Scanner;
import java.util.Scanner;
public class UserInput_Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      //java!= IDE (intellij)
        System.out.println(" enter your number: ");

        double num = scan.nextDouble();

        String result = (num % 2 == 0) ? num + " is even number" : num +" is odd number";
        System.out.println(result);




    }
}
