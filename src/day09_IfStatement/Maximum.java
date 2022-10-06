package day09_IfStatement;
/*
 1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

                a, b, c
 */
public class Maximum {

    public static void main(String[] args) {

     double a = 500;
     double b = 200;
     double c = 1000;

       boolean aIsMax = a > b && a > c;
    //

       boolean bIsMax = b > a && b > c;
      // aIsMax == false && b > c ;

        boolean cIsMax = c > b && c > a;
                //!aIsMax && !bIsMax ; ===> !( aIsMax && bIsMax);
                // aIsMax == false && bIsMax == false;


       double max = 0 ; // we want to assign maximum number to variable max
// local variable.

        if ( aIsMax) {
           // System.out.println( a);
            max = a ;
        }

        if ( bIsMax){
           // System.out.println(b); initialized variable to max (sifirlamak , tamamlanmak , baslatilmak)
            max = b ;           // ilk deger verilmis/ atanmis
        }

        if ( cIsMax){
            //System.out.println(c);
            max = c ;
        }

        System.out.println(max + " is maximum number");




    }
}
