package day11_NestedIf_Ternary;
/*
 task03:
            write a program that can find the number of days in a months
            (MUST APPLY NESTED IF)
 */
public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 20;
        boolean validNumber = month >=1 && month <= 12 ;
        boolean days28 = month == 2; // for the months that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        // for the months that has 30 days

        String result = "";

        if (validNumber){// for 28 days or 30 days or 31 days
             if (days28){
                 result = " 28 days";
             }else if (days30){
                 result = " 30 days";
             }else{
                 result = "31 days";
             }


             }else{// invalid number
                 result = "invalid";
        }

        System.out.println( result);




    }






}
