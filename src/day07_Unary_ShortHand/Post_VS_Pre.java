package day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {
     int a = 10;
        System.out.println(++a); // 11
        System.out.println(a); //11

        System.out.println("============================");

        //post:
        int b = 10;
        System.out.println(b++);// current value // 10 after this line will be 11
        System.out.println(b); // 11

        System.out.println("========================");
        int c = 25;
        int d = c++; // d = 25;
        // c = 26;
        System.out.println(c);
        System.out.println(d);


        System.out.println("========================");
        int e = 25;
        e++; //after this line will be 26 post increment
        System.out.println(e);// 26

        System.out.println("=========================");

             int A = 1;
              A = -A-- + A++ / -A-- * --A ;
        // A = -1 + 0 / -1 * -1 ;
        //    -1 +0 * -1 // -1 +0 = -1
        System.out.println(A); // =-1





    }
}
