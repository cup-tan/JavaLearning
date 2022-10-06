package day55_Abstraction;

 final class A{ // can create object from it

    int a = 10;
    static int b = 20;

    public void method1(){

    }

    public static void method2(){

    }

    public A(){

    }

    static {

    }

 //   public abstract void method3();

}

 abstract class B{ // can ot create object from it, cannot be final

     int a = 10;
     static int b = 20;

     public void method1(){

     }

     public static void method2(){

     }

     public B(){

     }

     static {

     }

     public abstract void method3();




}

public class AbsClass_VS_RegClass {
}
