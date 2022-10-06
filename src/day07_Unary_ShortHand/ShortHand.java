package day07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {
         int a = 100;
          //   a = a * a;
            a *= a;

        System.out.println(a); // 10.000

        int b = 2;
        b *= 3;
        System.out.println(b); //6

        int c = 300;
            c -= 100;
        System.out.println(c); // 200
        System.out.println("==============");

        //+=

        int z = 300;// 300+200
            z += 100;//z = z + 200
        System.out.println(z); // 500

        String schoolName = "Cybertek"; // += apply also concatenation to string
            schoolName += " school";
        System.out.println( schoolName);

        String fullName = "Mickey";
               fullName += " Mouse";
        System.out.println(fullName);

        // /=

        int budget = 100000;
        budget /= 2;
        System.out.println(budget); // 50000

        budget /= 4;
        System.out.println(budget); /* 12500 */

        int q = 100;

        System.out.println(q/2); // 50
        System.out.println( q ); // 100

        // %=
          int num = 100;
          num %= 3;
        System.out.println(num); // 1

        double num2 = 400.5;
               num2 %= 2;
        System.out.println(num2); // 0.5

        String test1 = "drink";
        boolean test2 = test1 == "drink";
        System.out.println(test2);












    }
}
