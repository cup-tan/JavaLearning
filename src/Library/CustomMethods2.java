package Library;

public class CustomMethods2 {


    public static void maxNum(int[] arr){
        int max = arr[0];

        for (int each : arr){
            //for (int i = 0; i <= arr.length-1; i++){
            if (each > max){
                max = each;
            }
        }
        System.out.println("maximum number: "+max);
    }

    public static void minNum(int[] arr){
        int min = arr[0];
        for (int each : arr){
            if (each < min){
                min = each;
            }
        }
        System.out.println("minimum number: "+min);
    }
}
