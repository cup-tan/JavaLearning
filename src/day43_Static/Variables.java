package day43_Static;

public class Variables {

    int d; //Advantage is  when we create multiple objects , you can store multiple data in to this instance
    static int s; // belongs to the class


    public void method2(){ // object came from the class, so it accepts static variable
        System.out.println(d);
        System.out.println(s);

    }

    public static void main(String[] args) {
       // System.out.println(a); // local variable not accessible
          System.out.println(s);



          // System.out.println(d);// we have to have object , then we can print the instance variable
        Variables obj = new Variables();
        System.out.println(obj.d);


    }



    public static void method1(){
        int a;

        if (true){
            int b = 20;
        }

     //   System.out.println(b);// local variable is only accessible within the blocks

      //  System.out.println(a);// local variable must be initialize to print , otherwise it gives compile error

    }

}
