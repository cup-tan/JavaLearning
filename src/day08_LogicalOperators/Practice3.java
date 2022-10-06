package day08_LogicalOperators;

/* 1. Create a double variable with the value 20
2. Create a second variable of type double with the value 80
3. Add both numbers up and multiply by 25
4. Use the remainder operator to figure out the remainder from the sum of #3 divided
by 40
5. Print remaining total (#4) is equal to 20 or less : true/false
*/
public class Practice3 {

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 80;
        double res = ((num1 + num2) * 25);// paranthesis will be first calculator // 2500
        double remainder = res % 40;
                         // 2500
        boolean remainingTotal = remainder <= 20;

        System.out.println(remainder +" is equal to 20 or less: " + remainingTotal);





    }
}
