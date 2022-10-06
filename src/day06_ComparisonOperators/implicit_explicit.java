package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1;  // implicit casting : automatically done

        long l2 = (long) s1 ; // if we implicit manually casting


        int I1 = 300;
        double D1 = I1; //300.0            // automatically done  int  changed to double
        System.out.println( D1);
        double D2 = (double) I1; // gray is extra step not needed

        System.out.println("==============================");

        double d1 = 400.55555;
        int i1 = (int)d1; // explicit casting , need to do manually from larger to smaller
        //elimated decimal number only will be integer
        // 400
        System.out.println(i1);

        long L1 = 4400; // this value cannot assign for byte
        short S1 = (short) L1; // should be same short and short
        System.out.println(S1);

        int n1 = 1000;
        byte b1 = (byte)n1; //explicit casting larger to smaller manually
        System.out.println(b1); // not fit with byte result: negative number -24


        double m1 = 34.5;
        float f1 = (float) m1;// float contain in double= explicit casting


        double M1 = 34.5;
        float F1 = (int) M1; // int normally will be 34 . but datatype works as float ,so result will be decimal
                             //  result: 34.0
        System.out.println(F1);
        // primitive (kurala bagli olmayan)

        long r1 = - 500;
        int p1 = (int) r1 ; // short can be assigned to int primitive type because INT is larger than SHORT
        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte) r2;
        System.out.println(t1);  // assigning larger to smaller





















    }
}
