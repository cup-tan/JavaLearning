package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");


        // verify that the names Ulku, Busra are contained in students list
        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));

        System.out.println(r1);

        System.out.println("===================================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
        group1.addAll( Arrays.asList("Muhtar", "Nadir", "Asiya", "Saim")); // [Muhtar, Nadir, Asiya, Saim]

        System.out.println(group1);



        // verify your mentor and one of your closest friend's names are contained in the list
        boolean r2 =  group1.containsAll(Arrays.asList("Murodil", "Kuzzat"));

        System.out.println(r2); // false

        System.out.println("=================================================");

// 1. write a program that can remove all the names named 'Ahmed' from the list of names // interview question

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll( Arrays.asList("Ahmed", "Muhtar","Ahmed", "Virginia","Beslan","Ibrahim", "Ahmed"));

        System.out.println(employeeName);// [Ahmed, Muhtar, Ahmed, Virginia, Beslan, Ibrahim, Ahmed]

        employeeName.removeAll(Arrays.asList("Ahmed")); // matching element
        System.out.println(employeeName);// [Muhtar, Virginia, Beslan, Ibrahim]






    }
}
