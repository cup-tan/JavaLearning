package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {

        char[] ch1 ={'A','B'};
        char[] ch2 ={'C','D','E'};
        char[] ch3 ={'F','G','H'};

        //                  0   1       0   1   2      0   1   2
        char[][] ch2D ={  {'A','B'},  {'C','D','E'}, {'F','G','H'}  };
        //                   0             1              2

        System.out.println(Arrays.toString(ch2D[1]));//[C, D, E]

        System.out.println(Arrays.toString(ch2D[2]));//[F, G, H]

       // H  out from the dimensional array
        System.out.println(ch2D[2][2]);

        //C
        System.out.println(ch2D[1][0]);

         // G  B
        System.out.println(ch2D[2][1]+"  "+ch2D[0][1]);


        System.out.println("================================================================");



    }
}
