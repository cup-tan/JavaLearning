package day56_Abstraction;

public abstract class AbstractClass_VS_Interface {

   public int a ;
   protected static int b;

   public void method1(){}

   public static void method2(){}

   public abstract void method3();

    public AbstractClass_VS_Interface(int a){
        this.a = a;
    }

    static {b = 300;} // static block

    {a = 300;} // instance block

}

interface A{

    int a = 10; // public static final by default

  //  public void method1(){}

    static void method2() {} //  by default is public

    abstract void method3(); // public
             void method4(); // public abstract

     default  void method5(){} // public, it not necessary to write public

   // public A(){} ,, cannot have constructor, static , instance block

   // static {}

   // {}

        }
