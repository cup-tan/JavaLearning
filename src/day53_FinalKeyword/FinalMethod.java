package day53_FinalKeyword;

//final
class A{ // the class cannot have sub classes , and the class give compile error when we extended


    public A(){ }

    public final void method1(){
        System.out.println("Enter username and password");
    }

    private final void method1(int a){

    }

    public final  static void method2(){

    }
}


public class FinalMethod extends A{
/*
   // @Override
    public void method1(String b){
        System.out.println("Enter something else");
    }
*/

    public final static void main(String[] args){
        System.out.println("Hello");
    }
}
