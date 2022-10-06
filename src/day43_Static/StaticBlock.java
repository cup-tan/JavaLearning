package day43_Static;

public class StaticBlock {


    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static { // different code fragment // static block get executed first

        System.out.println("Static block");
    }





}
