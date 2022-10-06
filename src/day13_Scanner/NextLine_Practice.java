package day13_Scanner;
import java.util.Scanner;
public class NextLine_Practice {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("enter your building number");
        int num = scan.nextInt();

        scan.nextLine();
        System.out.println("enter your address");
        String address = scan.nextLine();
        String  result = num +" "+ address;

        System.out.println(result);







    }
}
