package day09_IfStatement;

public class MediunNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 150;

      boolean aIsMed =(a > b && a < c ) || (a > c && a < b);
      boolean bIsMed =(b > a && b < c ) || (b > c && b < a);
      boolean cIsMed =(aIsMed == false && bIsMed == false);
      //     !aIsMed && !bIsMed;

        double med = 0;

        if (aIsMed){
            med = a;
        }
        if (bIsMed){
            med = b;
        }
        if (cIsMed){
            med = c;
        }
        System.out.println(med);

    }
}
