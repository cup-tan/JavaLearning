package Library;

import java.util.Arrays;

public class Util {
    public static void main(String[] args) {}


        public static String removeDup (String str){ //"abab" // data structure . array collection map for each loop
            String nonDub = "";//"ab"

            //  split [a,b,a,b]
            for (String each : str.split("")) {
                //  for (int i = 0; i <= str.length()-1; i++){
                //     String each = "" + str.charAt(i);
                if (!nonDub.contains(each)) {
                    nonDub += each;
                }

            }
            return nonDub;
        }
        //removes the duplicates and returns the value string

        public static String reverse (String str){
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        } // static that we can call it with true classname
        //reverse the string and return the value

        public static int maxNum ( int[] arr){
            int max = arr[0];

            for (int each : arr) {
                //for (int i = 0; i <= arr.length-1; i++){
                if (each > max) {
                    max = each;
                }
            }
            return max;
        }
        //find and returns the max number from in array

        public static Integer maxNum ( Integer[] arr){
            Integer max = arr[0];

        for (Integer each : arr) {
            //for (int i = 0; i <= arr.length-1; i++){
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
        //find and returns the max number from in array
        public static double maxNum ( double[] arr){
        double max = arr[0];

        for (double each : arr) {
            //for (int i = 0; i <= arr.length-1; i++){
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
        //find and returns the max number from in array
        public static Double maxNum ( Double[] arr){
        Double max = arr[0];

        for (Double each : arr) {
            //for (int i = 0; i <= arr.length-1; i++){
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
         //find and returns the max number from in array


        public static Integer minNum ( Integer[] arr){
            Integer min = arr[0];
            for (Integer each : arr) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        }
        // find and returns the min number from in array
        public static double minNum ( double[] arr){
           double min = arr[0];
            for (double each : arr) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        }
        // find and returns the min number from in array
        public static Double minNum ( Double[] arr){
        Double min = arr[0];
        for (Double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
        // find and returns the min number from in array
        public static int minNum ( int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
        // find and returns the min number from in array



        public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;


        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;

        }
        return arr2;
    }
        // inserts the element to the array

     /*
     double, Double, Integer, char, Character, String array
      */







        public static int frequency(String str, char ch) { // finds the frequency of char from string
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;

    }
        //finds the frequency of char from string str and returns it as int

        public static String uniques(String str){
        String uniques = ""; //"bd"

        for (char each : str.toCharArray()){
            int count = frequency(str,each); // frequency of every character
            if (count ==1){
                uniques += each;
            }
        }
        return uniques;
    }
        // returns the uniques from the string

        public static String formatFullName(String first , String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //     Convert first char to upper case      // convert rest of the chars to lowers

        last = last.substring(0,1).toUpperCase() +last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        return fullName;
    }
      // formats the full name

        public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDub = Util.removeDup(str);

        for ( char each : nonDub.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += ""+each +count1;
        }
        return expectedResult;


    }
  //     returns the frequency of every single characters from a string

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
    // sorts int array in descending order and returns it
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
    // sorts double array in descending order and returns it
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
    // sorts char array in descending order and returns it
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
// sorts String array in descending order and returns it

    public static Integer[] sortDesc(Integer[] arr){
    Arrays.sort(arr);

    Integer[] arr2 = new Integer[arr.length];

    int k = arr.length-1;
    for (int i = 0; i <= arr2.length-1; i++){
        arr2[i]= arr[k];
        k--;
    }
    return arr2;  // array name
}
    //   sorts Integer array in descending order
    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // array name
    }
    //   sorts Double array in descending order
    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for (int i = 0; i <= arr2.length-1; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;  // array name
    }
//   sorts Character array in descending order

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1){
            arr3[i] = each;
            i++;
        }

        for (int each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1){
            arr3[i] = each;
            i++;
        }

        for (String each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1){
            arr3[i] = each;
            i++;
        }

        for (double each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1){
            arr3[i] = each;
            i++;
        }

        for (char each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];
        int i = 0;
        for (Integer each : arr1){
            arr3[i] = each;
            i++;
        }

        for (Integer each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];
        int i = 0;
        for (Double each : arr1){
            arr3[i] = each;
            i++;
        }

        for (Double each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it
    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];
        int i = 0;
        for (Character each : arr1){
            arr3[i] = each;
            i++;
        }

        for (Character each : arr2){
            arr3[i] = each;
            i++;
        }

        return arr3; // because if the method return type is void, it does not allow the method return any value at all
    }
    // combines two array and returns it


        /*
        1. a method that can find the frequency of characters a string
        2. a method that can find the unique characters from a string
        3. a method that cn combine two int arrays
         */

/*
      screenshot:
              1. TakeScreenShot
              2. browser
              3. save
 */

    /*
    create methods that can sort Integer array, Double Array, Character Array in descending order
    create methods that cn combine two double arrays, char arrays,
    String arrays, integer Arrays,Double arrays, Character arrays
     */

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e){

        }
    }
// causes the current execution thread to sleep for given seconds


    }
