package day30_CustomMethods;

public class ReturnMethods {

    public static void main(String[] args) {
   // int num = addition(3,4);
    addition1(3,4);  // not value , cannot reused

      int sum =  addition2(3,4);
        System.out.println(sum);

        System.out.println(addition2(3,4)*2);
    }

    public static void addition1(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b){
        int sum = a+b;
        return sum;
    }

}
