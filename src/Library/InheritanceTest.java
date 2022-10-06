package Library;

import day50_Inheritance_Overriding.AccessModifier;

public class InheritanceTest extends AccessModifier {

    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData); // public is visible outside package
        System.out.println(InheritanceTest.protectedData); // protected is visible always visible to any sub(child) class
      //  System.out.println(InheritanceTest.defaultData);// default is not visible outside package



    }






}
