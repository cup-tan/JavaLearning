package day29_CostumMethods;
/*
step1: print hello 5 times
step2: print your school name
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
 */
public class MethodWithoutParameter2 {

    /*
    Access-Modifier Specifiers return-type    name(){
           statements;
      }
     */
    public static void main(String[] args) {

      printHello5X();
        System.out.println("Cybertek");
      printHello5X();
        System.out.println("Asli");
      printHello5X();

    }


    public static void printHello5X(){
        for(int i = 10; i >= 6; i--){
            System.out.println("Hello");
        }







    }
}
