package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3};

        //                  0 1 2     0 1 2 3 4     0  1  2  3  4
        int[][] arr2D = {  {1,2,3},  {4,5,6,7,8},  {9,10,11,12,13} };
       //                     0           1               2

    // {4,5,6,7,8}


        System.out.println(  Arrays.toString( arr2D[1] )  );     // single dimensional int array

        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6, 7, 8], [9, 10, 11, 12, 13]]

        // for specific element

        // 7

        System.out.println( arr2D[1][3]); // not array not it returns element ,so we can print out only system.out.

        System.out.println("===================================================================");

        for (int i = 0; i <= arr2D.length-1; i++){    // iterates each 1D array from arr2D // gets each 1D array from arr2D
            int[] each1DArray = arr2D[i];
          //  System.out.println(Arrays.toString(each1DArray)); // all those arrays will be printed out

            for (int j = 0; j <= each1DArray.length -1; j++){ // prints each the elements of  single dimensional array
                int eachNumber = each1DArray[j];
                if (eachNumber % 2 == 0){
                    System.out.print(eachNumber+" "); //element
                }

            }
            System.out.println();
        }

        System.out.println("================================================================");

        for (int[] each1D : arr2D){ // each of them are arrays so we created each1D
            for (int eachElement : each1D){
             if ( eachElement % 2 != 0){ //odd number
                 System.out.print(eachElement+" ");
                }

            }
            System.out.println();  // appendix new line
        }































    }
}
