package day46_ConstructorCalls;

public class ConstructorCall4 {

    public ConstructorCall4(){
        // this();
       // this(3.5);

    }


    public  ConstructorCall4(int a){
        this(2.5); // contains constructor with double arg
    }

    public  ConstructorCall4(double a){
        //this(10);
       //   this(); // contains default constructor

    }

}
