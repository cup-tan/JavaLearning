package day30_CustomMethods;

public class Recap {
    public static void main(String[] args) {
        String[] arr= {"a","b"};
        uniques(arr);
    }

//	8. write a method that can print out the unique elements
    //	from an array of string

    public static void uniques(String[] args){
     //   String[] arr = {"A", "B", "B", "C","D","E","F"};


       for (String a : args){// gets every single elements from in array
           int count = 0;

           for (String each : args){ // gets frequency of every single elements
               if (a.equals(each)){
                   count++;
               }
           }
           if (count ==1){
               System.out.println(a);
           }
       }

    }

}
