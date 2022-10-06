package day29_CostumMethods;

public class UniqueElements {
    //	8. write a method that can print out the unique elements
    //	from an array of string

    public static void main(String[] args) {


        String[] arr = { "A", "B", "B","C"};
        uniques(arr);

        System.out.println("Hello");

        String[] arr2 = {"D", "D", "E","F","F"};
        uniques(arr2);
    }

    public static void uniques(String[] arr){
        for (String a: arr){ // gets each of the elements
            int count = 0;
            for (String each : arr){ // gets the frequency of the elements
                if (a.equals(each)){
                    count++;
                }
            }
            if (count ==1){// unique
                System.out.print(a +" ");
            }
        }
        System.out.println();
    }


}
