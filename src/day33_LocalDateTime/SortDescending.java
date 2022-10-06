package day33_LocalDateTime;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortDescending {
    /*
    Task02:
		1. create a return method that can return an int array in descending order
		2. create a return method that can return a double array in descending order
		3. create a return method that can return a String array in descending order
		4. create a return method that can return a char array in descending order
     */
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        Arrays.sort(arr); // {1,2,3,4,5}
        // we want to get result //

       int[] arr2 = new int[arr.length]; //{5,4,3,2,1} // we only initialize the size [0, 0, 0, 0, 0]
     /*   //    i          k
         arr2[0]= arr[arr.length-1];//5
         arr2[1] = arr[3]; //4
         arr2[2] = arr[2]; //3
         arr2[3] = arr[1];//2
         arr2[4] = arr[0];//1

        System.out.println(Arrays.toString(arr2));
*/
        int k = arr.length-1;
         for (int i = 0; i <= arr2.length-1; i++){
             arr2[i]= arr[k];
             k--;
         }
         /*
             for (int i = 0 ; i <= arr2.length-1; i++){
                 for (int k = arr.length-1; k >= 0; k--){
                    arr[k]= arr2[i];
                 }
             }
                                                 // largest number is last
          */
        System.out.println(Arrays.toString(arr2)); // last element is first that assign to do index 0 to other array


        System.out.println("================================");

        int[] scores = {100,75,85,95,65,55};

     scores =  sortDesc(scores);// sor
       System.out.println(Arrays.toString(scores));


    }

    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // array name
    }

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // array name
    }

    public static char[] sortDesc(char[] arr){  // change only dataType
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // array name
    }

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // return type // has to match is return type of the method
    }





}
