package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args){

      boolean r1 = 10 > 9; // true
        System.out.println(r1);

        // >=  ( or , either)
       boolean r2 = 87 >= 85; // if  first condition is true (>) it can be true
        System.out.println(r2);

        boolean r4 = 877 >= 878; // because first condition is false
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;
        System.out.println(r5); // true

        // ==: equal

        boolean r6 = 900 == 800; // false not equal
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7); // false

        //!=

        boolean r8 = "Muhtar" != "Bad guy";
        System.out.println(r8); // true

        boolean r9 = true != false;
        System.out.println(r9); // true

        boolean result1 = 'A' == 65; //65+3+3  seperately equation
        System.out.println(result1);//true

        boolean result2 = 100 == 100.0;
        System.out.println(result2);// true

        boolean result3 = 10 == (int) 10.99999; // result 10
        System.out.println(result3); // false

        boolean result4 = "100" == "100.0"; // how many characters there are different character . FALSE
        System.out.println(result4);// false
        System.out.println("======================");

        int number = 100;
        boolean even = number%2 == 0;
        System.out.println(even); //true

        int number1 = 101;
        boolean odd = number1%2 != 0;
        System.out.println(odd); // true
















    }

}

