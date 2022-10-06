package day24_Arrays;

public class UniqueNumbers2 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,5,6,7,7,8,9,9};

        for (int a : arr){  // a is element not index number
            int count =0;


            for (int b : arr){
                if (b ==a){
                    count++;
                }

            }

            if (count ==1){
                System.out.println(a +" ");
            }
        }



    }
}
