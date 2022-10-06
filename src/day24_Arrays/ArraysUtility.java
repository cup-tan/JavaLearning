package day24_Arrays;
import java.util.Arrays;       //arrays class is specific         // .* import everything unnecessary any stuff
public class ArraysUtility {

    public static void main(String[] args) {

        int arr[] ={1,2,3};
        System.out.println(arr);

        System.out.println( Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"muhtar", "saim","nadir","asiya","kuzzat"};
        System.out.println(names);// in order to print array variable we MUST convert it to string

        System.out.println(Arrays.toString(names)); // [muhtar, saim, nadir, asiya, kuzzat]

        System.out.println("========================================================");
        int[] num ={5,4,6,5,10,3,4};
        System.out.println(Arrays.toString(num)); //[5, 4, 6, 5, 4, 3, 10] before sort method


        Arrays.sort(num);

        System.out.println(Arrays.toString(num)); //[3,4,4,5,5,6,10] after sort method

        System.out.println("Maximum number: "+num[num.length-1]);
        System.out.println("Minimum number: "+num[0]);

       String students[] = {"Mehdi","Elkem","Meee","Trump"};

       Arrays.sort(students);

        System.out.println(Arrays.toString(students));//[Elkem, Meee, Mehdi, Trump]



       //["Elkem", "Meee", "Mehdi", "Trump"] // ascending smallest to largest

         // A~Z

        System.out.println("=====================================");
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

       boolean r1 = Arrays.equals(arr1,arr2); //true

        System.out.println(r1); //it checks index by index

        int[] arr3 ={2,1,3};
// sort is first
        Arrays.sort(arr2); // 1,2,3
        Arrays.sort(arr3);// 1,2,3
        boolean r2 = Arrays.equals(arr2,arr3);
        System.out.println(r2); // false

        int[] arr4 ={1,1,2,3}; // we cannot change the size 4 is 4
        int[] arr5 ={1,2,3};

        boolean r3 = Arrays.equals(arr4,arr5);
        System.out.println(r3); //false




    }
}
