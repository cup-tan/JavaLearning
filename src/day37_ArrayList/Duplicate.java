package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Duplicate {
    /*
    tasks:
	1. write a program that can return the duplicated elements from an arrayList of Integer
				Ex:
					list: {1,1,2,2,2,3,4,5,6}
					output: {1,1,2,2}

					DO NOT use loop

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,2,3,3,4,5,6,7,8));// asList : it takes array value and it returns collection Type

        list.removeIf( p-> Collections.frequency(list,p) == 1 ); // there is no unique element

        System.out.println(list);// [1, 1, 2, 2, 2, 3, 3]

        System.out.println("==========================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Canada","Bob","David","lan","Abide","Ebrahim","Farida"));

        names.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));//each is p ====> string of array list ,it is element

        System.out.println(names);// [Anna, Bob, David]

        System.out.println("==============================================");

        ArrayList<Integer> grades = new ArrayList<>();
       grades.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();// 90 ~100
        ArrayList<Integer> gradeOfB = new ArrayList<>();// 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>();// 70 ~79
        ArrayList<Integer> gradeOfD = new ArrayList<>();//60 ~69
        ArrayList<Integer> gradeOfE = new ArrayList<>();// below 60
/*
      how many students made:
            A?
            B?
            C?
            D?
            how many failed?

            DO NOT USE loop

 */








    }
}
