package day32_MethodOverloading;

import java.util.Scanner;

/*
1. write a method that can return the full name of a person in regular format

			ex:
				formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
 */
public class formatFullName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();


        String fullName = formatFullName(first, last);
        System.out.println(fullName);

        //    String first = "cYbErTeK";

        //    String last = "TISCEnco";
//does charAt have upperCase method ?no
        //   first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
   /*     //     Convert first char to upper case      // convert rest of the chars to lowers

        last = last.substring(0,1).toUpperCase() +last.substring(1).toLowerCase();

        String fullName = first + " " + last;


        System.out.println(fullName);

    }
*/

    }
    public static String formatFullName(String first , String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //     Convert first char to upper case      // convert rest of the chars to lowers

        last = last.substring(0,1).toUpperCase() +last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        return fullName;
    }





}
