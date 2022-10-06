package day42_Static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName = "Cybertek School";
    static String favoriteTeacher = "Nadir";
// instance method belong to the object
// instance variable belongs to the object
// static belongs to the class member , because object it also share class members

    // objects that they are created from class
    // and also static is a member of class , they share members by all the object

    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public String toString(){ // instance method

        return "School Name: "+schoolName+"\nStudent Name: "+name;
        //                     static variable               instance variable
    }





}
