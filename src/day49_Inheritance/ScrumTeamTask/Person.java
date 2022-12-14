package day49_Inheritance.ScrumTeamTask;
/*
        create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo
 */
public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn; // we don't want this to be inherited to the sub classes

    public long getSsn(){
        return ssn;
    } // read ssn only

    public void setSsn(long ssn){
      this.ssn = ssn;
    }// set ssn only


    private void eat(){
        System.out.println(name+" is eating");  // we don't want this to be inherited to the sub classes
    }

    private void walk(){
        System.out.println(name+" is walking");  // we don't want this to be inherited to the sub classes
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void setPersonInfo (String name, int age, char gender){// only sets name, Age, Gender
        this.name = name;
        this.age = age;
         this.gender = gender;
    }



}
