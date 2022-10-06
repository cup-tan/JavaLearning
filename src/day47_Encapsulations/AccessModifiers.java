package day47_Encapsulations;

public class AccessModifiers {

    //public
    public static int publicVariable = 100;// public means data is always available, accessible in java and anywhere

    public static void publicMethod(){
        System.out.println("public method");

    } // static that it belongs to the class


    //default: // it's visible same class and same package
    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("default method");
    }

    //private: only with in class
// private --> access modifier/  static --> specifier
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);// static kullanmazsak gives compile error

        publicMethod();
        defaultMethod();
        privateMethod();




    }









}
