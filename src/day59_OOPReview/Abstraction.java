package day59_OOPReview;


interface X{
    public abstract void method1();
    void method2();

    int a = 10; // public static final by default , final means no need to assign
    static int b = 20;

   // X(){}

  //  static {}

}

abstract  class Y{

      int a;
      static int b;

          public abstract void method1();

          Y(){}
}


public class Abstraction {

    public static void main(String[] args) {
      //  Y obj = new Y(); we can create object because interface is not a class
      //  X obj2 = new X();




    }
}
