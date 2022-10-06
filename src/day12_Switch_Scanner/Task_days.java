package day12_Switch_Scanner;
/*
2. Write a program to display days: 1-Monday
2-Tuesday
3- Wednesday 4-Thursday 5-Friday 6-Saturday
 */
public class Task_days {

    public static void main(String[] args) {

        int day = 8;


        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
                break;

    // String result = "";
           //  System.out.println( result); DO NOT FORGET

     // Switch statement double long float and boolean. compile error





        }





    }
}
