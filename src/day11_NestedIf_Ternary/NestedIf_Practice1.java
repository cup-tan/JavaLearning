package day11_NestedIf_Ternary;
/*
 precondition: minimum salary of 30k
             sub condition: minimum 2 years of job history

 */
public class NestedIf_Practice1 {

    public static void main(String[] args) {
      double salary = 20000;
      int jobHistory = 3;

      if (salary >= 30000){
          if (jobHistory>=2 ){
              System.out.println(" you are qualified");
          }else{ // jobHistory < 2
              System.out.println( "you are not qualified");
          }
      }else{
          System.out.println( "you must earn at least 30K");
      }










        







    }
}
