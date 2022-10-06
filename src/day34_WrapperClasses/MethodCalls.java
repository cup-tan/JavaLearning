package day34_WrapperClasses;
import Library.Util; // Static keywords call through the CLASS NAME , only be STATIC KEYWORD

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};
        Integer[] arr3 = Util.combine2Arrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3)); //  [1, 2, 3, 4, 5, 6, 7, 8]

        Integer max = Util.maxNum(arr3);
        System.out.println(max); // 8


        int min = Util.minNum(arr3); // unboxing
        System.out.println(min); // 1

        Character[] ch = {'A', 'A', 'C', 'B', 'B', 'D'};

         ch  = Util.sortDesc(ch); // new array representing
        System.out.println(Arrays.toString(ch)); // [D, C, B, B, A, A]



    }

}
