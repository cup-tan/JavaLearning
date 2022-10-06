package day20_WhileLoops;

public class BranchingStatements {

    public static void main(String[] args) {

        char ch = 'A';
        while(ch <='E'){
           if (ch == 'C'){
               ch++;        // iterator ekledik cunku after continue herseyi yok sayiyor
               continue; //skips everything even the iterator // A B D E
         //    break; // A B
           }
            System.out.println(ch);

            ch++;

        }





    }
}
