package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        if (a > b) {
            System.out.println(a + " is the maximum number");
        }
        if (b > a) {
            System.out.println(b + " is the max number");
        }
        if ( a == b) {
            System.out.println(" Both are equal");
        }

        System.out.println("=======================");
        boolean BreakTime = true;  // two possibilities

        if ( BreakTime  == true) {
            System.out.println("Take 15 minutes break!");
        }
        if (BreakTime == false){  // block is important you need to seperate other condition to other in if statement
            System.out.println("Keep Studying");// regardless of statement. it executes print
            // it suppose to place in the body of if block
        }

        System.out.println("================");

        boolean Corona = true;  // boolean is true , and if condition is true. otherwise it doesn't execute
        if (Corona == true){
            System.out.println("Buy more toilet paper");
            System.out.println("Social distance");
            System.out.println(" Buy more hand sanitizers");
            System.out.println("stay at home");
        }
        
        






         }


        }



