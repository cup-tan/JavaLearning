package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,96,95,86,87,88,75,55,45,73,73,35,47,60,87,77,67,57,47,93,93,83,73,63,53,43)); // array of value returns collection type ===> Arrays.asList method
// dynamic - changeable




        ArrayList<Integer> gradeA = new ArrayList<>();// 90 ~ 100
        gradeA.addAll(list); // first store all the grades
        gradeA.removeIf(each -> each < 90 ); // second remove the grades that are not A
                      // only retain the grades of A

        System.out.println("Grade A: "+gradeA);


        ArrayList<Integer> gradeB = new ArrayList<>();// 80 ~ 89
        gradeB.addAll(list); // first store all the grades
        gradeB.removeIf(p -> p < 80 || p > 89 );  // second remove the grades that are not B (F, D, C, A)
                                                  // no way it happens same time about && and operator..
                         // if the grade is either less than 80 or greater than 89 should be removed
        System.out.println("Grade B: "+gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>();// 70 ~ 79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p < 70 || p > 79);
        System.out.println("Grade C: "+gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>();// 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf(p -> p < 60 || p > 69);

        System.out.println("Grade D: "+gradeD);


        ArrayList<Integer> gradeF = new ArrayList<>();// below 59
        gradeF.addAll(list);
        gradeF.removeIf(p -> p > 59 );

     /*   gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
*/

        System.out.println("Grade F: "+gradeF);


        System.out.println("============================");
        System.out.println( gradeA.size()+" students made A" );
        System.out.println( gradeB.size()+" students made B" );
        System.out.println( gradeC.size()+" students made C" );
        System.out.println( gradeD.size()+" students made D" );
        System.out.println( gradeF.size()+" students made FAILED" );


    }
}
