package day08_LogicalOperators;
/* A triangle is valid if the sum of three angles are equal to 180.
 write a program that check whether a triangle is valid or not. if valid print valid,
 otherwise print invalid
                Ex:
                    Angle1 =60
                    Angle2 = 120
                    Angle3 = 20

                output:
                        invalid triangle*/
public class Triangle {
    public static void main(String[] args) {

        double angle1 = 100; // if it is 200 .. invalid triangle
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean invalid = !valid;

        if ( valid){
            System.out.println( "valid Triangle");
        }
        if ( invalid){
            System.out.println("invalid Triangle"); // this boolean is opposite than other one . only will be one condition is true

        }








    }
}
