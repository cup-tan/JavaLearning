package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();  // TreeMap is going to sorting map bt the keys
                 students.put("Hasan",  LocalDate.of(1995,4,4));
                 students.put("Jesus", LocalDate.of(1979,1,19));
                 students.put("Muhtar", LocalDate.of(1985,5,19));
                 students.put("Muhtar",LocalDate.of(1965,4,3));
                 students.put("Jesus", LocalDate.of(1969,6,1)); // last one is accepted
                 students.put("John", LocalDate.of(1999,3,4));

        System.out.println(students);

        Set<String> keys = students.keySet();


        // applying loops to the keys
        for ( String each : students.keySet()){
            System.out.println(each);
        }

        System.out.println("=================================");

        // applying loops to the values

          for (LocalDate each : students.values()){
              System.out.println(each);
          }








    }
}
