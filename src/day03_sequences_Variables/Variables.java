package day03_sequences_Variables;
/*
    declare variables:
               DataType  variableName = Data;
 */
public class Variables {
    public static void main(String[] args ){
        // length: 11, width: 12  area: 132

        byte length = 11;
        byte width = 12;
        System.out.println(length* width);// not message no double code


        // 140
        // byte num1 = 140; out of byte range

        short num2 = 140;

       // 40000

       // short salary = 40000; compile error
        //data type variable name = data  cannot assign

        int salary2 = 40000;
        // int largenumber = 9999999999;
        //(the number is grader than int range if compiler give error)

        long largenumber= 99999999999l;

        // int more preferred
        int score = 100;
        System.out.println(score);

        // PI = 3.14

        double PI = 3.14;
        System.out.println(PI);

       float decimal1= 3.5f; // float and long put f and l

    }
}
