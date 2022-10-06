package day03_sequences_Variables;

public class Variables_Practice {
    public static void main(String[] args) {
        // 15000 , 100000
        int num1 = 15000;
        int num2 =100000;
        long sum = num1+num2;
        System.out.println(sum);

       float num3 =3.5f;
       double a = num3;
      // long b = num3; float ranger decimal- compiler error long
        System.out.println(num3);
        System.out.println(a);

        long x = 100;
        float y = x;
        double z = x;
        System.out.println(x);// 100
        System.out.println(y);// 100.0
        System.out.println(z);// 100.0

       // int p = 3.5;

        //variables: salary, tax
        //          totalSalary = salary* tax;
        //         salaryAfterTax = salary - totalTax

       /* salary: 100000    ,tax:  0.28;
            100000 * 0.28 = 28000;
            100000 - 28000 = 72000; */






    }
}
