package day51_Exceptions;


class C{

    public C (int a){
  //  public C (int a){// default constructor
        System.out.println("Super class' int arg constructor");
    }

}


public class SuperKeyword3 extends  C {// sub class has to call a constructor from super class

    public SuperKeyword3(int a){
        super(100);
        System.out.println("Sub class' constructor witn int arg");

    }










/*
    public void method(){
        super(300);
    }
 */
}
