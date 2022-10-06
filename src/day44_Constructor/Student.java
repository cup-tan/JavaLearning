package day44_Constructor;

public class Student {

    String name;
    int age;
    char gender;
    static String schoolName = "Cybertek University"; // is global variable, and belongs to the class, all the object belongs to the class
    // so object share schoolName


    public Student (String name, int age, char gender){   // constructor is object of Student Class
    this.name = name;
    this.age = age;
    this.gender = gender;

    }


  /*  public void setInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    */

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", School Name: "+schoolName;
    }













}
