package day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {
        int num =100;

       String result = "";
        if(num %2 == 0){
          result = "even";
        }else{
            result =" odd";
        }
        System.out.println(result);

        System.out.println("=========");
        String result2 = ( num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("==============");
        int num1 = 10;
        int num2 = 20;

        int max = 0;

        if (num1 > num2){
            max = num1;
        }else{
            max = num2;
        }
        System.out.println(max);

         int max2 = (num1 > num2) ? num1 : num2;
// only advantage is shorter
        System.out.println(max2);

        System.out.println("======================");
        int age = 20;
        boolean eligible = false;

        if ( age > 21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible); // false

      // first task: convert the if statements above to ternary

        boolean eligible1 = (age > 21) ? true : false; // returning boolean true and false
        System.out.println(eligible1);


        // second task: " can vote" or " cannot vote"

        String result3 = (age > 21) ? "can vote" : "cannot vote";
        System.out.println(result3);




























    }
}
