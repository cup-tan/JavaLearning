package day19_ForLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for ( int i = 1; i <= 5; i++){ //1,2,3,4,5

            if ( i == 3){ // skips 3 .
                continue; // if condition true, jumps to the next iteration
            }

            System.out.println(i+ " "); // 1 2 4 5
        }
        System.out.println("==================================");

       for (char ch = 'A'; ch <= 'F'; ch++ ){ // ch: A B C D E F

           if ( ch == 'C' || ch == 'F'){ // single character. Therefore we don't use and logic
               continue; // place before print statement
           }

           System.out.print(ch+ " ");

       }
        System.out.println();







    }
}
