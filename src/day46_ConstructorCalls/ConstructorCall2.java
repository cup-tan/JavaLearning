package day46_ConstructorCalls;

public class ConstructorCall2 {

    public ConstructorCall2(){
        System.out.println("A");
    }

    public ConstructorCall2(int a){
      //  ConstructorCall2();
        this();  // calling default constructor
        System.out.println("B");
    }

    public ConstructorCall2(String str){
        this(4); // A B
        System.out.println("C"); // C
    }

    public ConstructorCall2(char a){
        this(); // A --> call default one that is first
        System.out.println("D");
    }


    public ConstructorCall2(double a){

       System.out.println("E");
      //  this(10);// always has to be first step / otherwise it gives compile error
    }



    public static void main(String[] args) {

       // new ConstructorCall2(); //it calls first parameter A
        new ConstructorCall2('A');

    }



}
