package day08_LogicalOperators;
/*  3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?

                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
*/
public class Post_Pre {

    public static void main(String[] args) {
       int a = 200;
     // ++a , --a : pre, changes the variable's value by 1 right away
     // a++, a-- : post, first passes the current value, then change the variable's value by 1
        int b = -a++ + - --a * a-- % 2;
              //-200 + - 200 * 200 % 2;
                      //  multiplication is first
        System.out.println(b); // - 200
        System.out.println(a); // 199


        int x= 300;
        int y = 400;
        int z = x +y -x * y + x / y ;
        // firstly multiplication . secondly division











    }
}
