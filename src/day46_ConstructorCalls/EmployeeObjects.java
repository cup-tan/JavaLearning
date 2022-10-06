package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Cristina");

        System.out.println(employee1);
        System.out.println("=============================");

        Employee employee2 = new Employee("Selman", "QA");// we have to use existing Constructor

        System.out.println(employee2);

        System.out.println("==========================");

        Employee employee3 = new Employee("Liliia", "SDET", 123456);

        System.out.println(employee3);

        Employee employee4 = new Employee("Alex","SDET",1230983,120000.5);

        System.out.println(employee4);

        ArrayList<Integer> list1 = new ArrayList<>();
        // object from the array list , below is collection types

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList(1,2,3,4,5) );



    }
}
