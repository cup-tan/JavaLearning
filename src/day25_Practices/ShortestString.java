package day25_Practices;
// 2. Write a program that can return the shortest string of text from a String array
public class ShortestString {

    public static void main(String[] args) {

     String[] arr = {"Anam","Nickolas", "Amir", "Nurmamet","Abi","Ali","Joe"};

     int minLength = arr[0].length();//3

     for (int i = 0; i <= arr.length-1; i++){  // to find out the minimum length of the string in array
         int l = arr[i].length();// 4 , 8 , 4, 8

         if (l < minLength){
             minLength = l;
         }
     }


     for (int i = 0; i <= arr.length-1; i++) { // find out to see how many strings' lengths in the array is matching with minLength
            if(   arr[i].length() ==minLength){
                System.out.println(arr[i]);
            }

        }


    }


}
