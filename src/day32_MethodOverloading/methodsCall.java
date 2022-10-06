package day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class methodsCall {

    public static void main(String[] args) {
        String firstName = "elKEm";
        String lastName = "emEt";

        String fullName;

     fullName =   Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);


        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("===========================");

        int[] a = {200,300,400,500,600,60,50};
        int n = 2500; // add the last index of this array
         a  = Util.addElement(a,n); //new array // assign ettik cunku ilk a array yenilendi

        System.out.println(Arrays.toString(a));

    }
}
