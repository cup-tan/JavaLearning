package day13_Scanner;
import java.util.Scanner;
public class Scanner_next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your company name");
        String companyName = scan.next(); //only one word,not space

        System.out.println("your company name: " +companyName);




    }
}
