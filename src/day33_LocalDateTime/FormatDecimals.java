package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {//     sonuc  buraya gore sekilleniyor
        DecimalFormat df =  new DecimalFormat("0.00");              // after = is object part

        double a = 22/7.0 ;//3.142857142857143

        System.out.println(a);

        System.out.println(df.format(a) ); // 3.14

        System.out.println(df.format(6)); //6.00

    }
}
