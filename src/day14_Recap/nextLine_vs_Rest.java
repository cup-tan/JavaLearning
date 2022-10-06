package day14_Recap; // recap means ozet
import java.util.Scanner;
public class nextLine_vs_Rest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = input.nextInt();
// we have to use space method cunku int method dan string methoda gectik
        input.nextLine();//because of functional method // ONLY method take it out
        System.out.println("enter your full name: ");
        String fullName = input.nextLine();


        System.out.println("enter your company name: ");
        String companyName = input.nextLine();


        System.out.println(fullName+ " is "+age+ " years old" ) ;


    }
}
