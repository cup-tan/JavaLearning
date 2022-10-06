package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};

         Integer[] arr2 = {1,2,3,4};
         for (Integer each : arr2){
             System.out.println(each); // and also can be used int
        }


         double[] arr3 = {1,2,3,4,5,6,7};
         Double[] arr4 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0}; // loyal ==>  bagli // we can only assign its own primitive value in wrapper class

    //Double y1 = 4;
                //double
           for (Double each : arr4){ // we can assign directly .
               System.out.println(each);
           }

           char[] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5)); // [A, C, D, E]

        char ch = 79;
        Character ch2 = 79; //char also takes a number

        System.out.println(ch2);// O       gets character has a number


        // string array to double array


        String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};

        double[] nums2 =  new double[nums1.length];

        for (int i = 0 ; i <= nums1.length-1; i++){
               nums2[i] = Double.parseDouble(nums1[i]);
        }

        System.out.println(Arrays.toString(nums2)); // [12.5, 13.5, 14.5, 15.5]







    }
}
