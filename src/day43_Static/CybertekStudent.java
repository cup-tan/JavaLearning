package day43_Static;

class A{
    static int a = 200;
}

public class CybertekStudent {
    // for the advantages of static
 /*   public static void main(String[] args) {

        System.out.println(A.a); // only one coppy main advantage // other one is we can call with class name
    }

   */

    String studentName;
    int age;
    char gender;
    static  String schoolName = "Cybertek School";

 /* public static void getInfo(){ // static only accept static variable or static
      System.out.println("Name: "+studentName);
  }
*/

    public void getInfo(){
        System.out.println("Name: "+studentName);
    }


    public static void printSchoolName(){
        System.out.println("School Name : "+schoolName);
    }
}
