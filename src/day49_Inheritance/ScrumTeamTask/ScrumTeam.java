package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam
                    Attributes:
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            addTester(Tester tester): adds the given tester to the testers array-list
                            addTesters(Tester[] testers): adds the given testers to the testers array-list
                            addDeveloper(Developer developer): adds the given developer to the developers array-list
                            addDevelopers(Developer[] developers): adds the given developers to the developers array-list
                            removeTester(long employeeID): removes the given tester from the testers array-list
                            removeDeveloper(long employeeID): removes the developer from the developers array-list
 */
public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers); // adds the array of testers to the list
        addDevelopers(developers); // adds the array of developers to the list
    }

    public  void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int ID){
        testers.removeIf(p -> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p -> p.ID == ID);

    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);  // removes the tester from list
        removeDeveloper(developerID);  // removes the developer form the list
    }

    public String toString(){
        return  "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "\n================================";
    }
}
