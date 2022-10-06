package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double>  employees = new LinkedHashMap<>(); // {}
        employees.put("Elvira", 150000.0); // key ==> cannot be duplicated -> first one
        employees.put("Ziiadin", 120000.0); // value ==> can be duplicated -> second one
        employees.put("Roman", 130000.0);
        employees.put("Cihan", 140000.0);
        employees.put("Nurbiye",120000.0);


        System.out.println(employees);
        System.out.println(employees.size()); // returns how many pairs of data
        // {Elvira=10000.0} // 1


        System.out.println("Salary of Ziiadin: $"+employees.get("Ziiadin")); // Salary of Ziiadin: $10000.0

        employees.remove("Ziiadin");

        System.out.println(employees);
        System.out.println(employees.size()); // size is dynamic


       boolean r1 = employees.containsKey("Roman");
        System.out.println(r1);

        System.out.println(employees);

        boolean r2 = employees.containsValue(120000.5);
        System.out.println(r2);

        boolean r3 = employees.containsValue(150000.0);

        System.out.println(r3);

        employees.clear(); // returns size 0 , {}

        System.out.println(employees);

        boolean r4 = employees.isEmpty();
        System.out.println(r4);


















    }
}
