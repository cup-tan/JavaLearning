package day47_Encapsulations;

public class Constructor {

    static {
        System.out.println("static block");
    }


    public Constructor(int a){
        System.out.println("int arg");
    }

    public Constructor(double a){
     this(10);// int arg
        // this("A");
     System.out.println("double arg");

    }

    public Constructor(String a){
     this(5.5);// int , double
        System.out.println("String arg"); // string
    }



    public static void main(String[] args) {

        // new Constructor(); // default constructor
        new Constructor(10);
        new Constructor(10.0); // it executed TWICE





    }


}
