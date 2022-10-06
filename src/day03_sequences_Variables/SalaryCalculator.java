package day03_sequences_Variables;
//variables: salary, tax
//              totalSalary = salary* tax;
//             salaryAfterTax = salary - totalTax
/* salary: 100000    ,tax:  0.28;
            100000 * 0.28 = 28000;
            100000 - 28000 = 72000; */
public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 150000.0;
        double tax = 0.28;

       double totalTax = salary * tax;// 28000 // memorized
       double salaryAfterTax = salary - totalTax;//72000.0

        System.out.println(salaryAfterTax);

        double number1 = 123;
        double number$ = 1234;



    }
}
