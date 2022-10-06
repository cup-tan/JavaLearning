package day54_Abstraction.CarsTask;

   public class BMW extends Car{
   // it gives logical error


       @Override // we cannot use final, static, private , if we call override
       public void start() {
           System.out.println("Starting BMW by: push start button");

       }
   }
