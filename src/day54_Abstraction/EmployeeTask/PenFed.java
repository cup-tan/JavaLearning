package day54_Abstraction.EmployeeTask;
/*
4. create a class called PenFed
			create 3 objects of Tester and Developers
 */

import java.time.LocalDate;

public class PenFed {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Aslihan BASAK",'F', LocalDate.of(1993,1,7),"QA",1500000);
     //   tester1.gender = 'F';// can only read it, cannot modify it because, tester class is final
     //   tester1.DOfB = LocalDate.of(2000,11,20); // can only read it , cannot modify it
        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);


        Developer developer1 = new Developer("Virginia", 'F',LocalDate.of(2000,11,2), "QA", 1200000);
        // developer1.gender = 'M';
        //  developer1.DOfB = LocalDate.of(1993, 11, 25);

        System.out.println(developer1.gender);
        System.out.println(developer1.name);


    }



}
