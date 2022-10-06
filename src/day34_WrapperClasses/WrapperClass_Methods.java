package day34_WrapperClasses;

public class WrapperClass_Methods {

    public static void main(String[] args) {
        String str = "123"; // text
               int a = Integer.parseInt(str); //123 // converts string value to primitive

        System.out.println(str+1);// string if it gets concatenation , it is string ===> 1231
        System.out.println(a+1); // number if it gets addition, it is number ===> 124


       Double d1 = Double.parseDouble("7.5");
        System.out.println(d1 -1);

        String s1 = "TRUE";
        Boolean b1 = Boolean.parseBoolean(s1); // parse method ignore the case sensitivity
        System.out.println(!b1);//true +  ! logical operator we can apply only boolean

        System.out.println("======================================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2); // unboxing

        System.out.println(d2*2); //20001.0


        String s3 = "False";

       boolean r2 = Boolean.valueOf(s3); // returns you wrapper class , can assign primitive // unboxing
        System.out.println(r2);//false
















    }
}
