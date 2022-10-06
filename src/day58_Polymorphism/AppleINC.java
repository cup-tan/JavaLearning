package day58_Polymorphism;
import day57_Polymorphism.EmployeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {

//this way is how to find how many testers , developers
        Employee[] workers =  {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M')
        };

        ArrayList<Employee> scrumMaster = new ArrayList<>(Arrays.asList(workers));
        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

      /*  scrumMaster.forEach( each -> { if(each instanceof  Tester) { countTester++; }
                                         else if (each instanceof  Developer){ countDeveloper++; }
                                         else{ countScrumMaster++;}
                                          } );

*/


        for ( Employee each : scrumMaster){
            if (each instanceof Tester){
                countTester++;
            }else if (each instanceof Developer){
                countDeveloper++;
            }else{
                countScrumMaster++;
            }
        }


        System.out.println("Tester: "+countTester);
        System.out.println("Developer: "+countDeveloper);
        System.out.println("Scrum Master: "+countScrumMaster);





    }
}
