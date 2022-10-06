package Library;

import day47_Encapsulations.AccessModifiers;


public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();
        // public is accessible outside of the package

        // System.out.println(AccessModifiers.defaultVariable);// default is not accessible outside of package
        // outside of the package , it never calls, not accessible
        // AccessModifiers.defaultMethod();// default is accessible only in the its package


     //   System.out.println(AccessModifiers.privateVariable);// private is not not visible outside its class
     //   AccessModifiers.privateMethod();


    }
}
