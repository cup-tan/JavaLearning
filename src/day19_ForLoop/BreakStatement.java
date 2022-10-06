package day19_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for ( int i = 0; i < 5; i++){
            System.out.println("Hello");
            break;
        }

        System.out.println("==================================");

        for ( char ch = 'A'; ch <= 'H'; ch++) { // ch:A  B  C
            if (ch == 'C') {
                break; // it does matter where the break statement is put
            }

            System.out.print(ch + " ");// A B

        }
        System.out.println();
        System.out.println("===============================");

        for ( int i = 10; i <= 50; i+= 10){ // i: 10, 20, 30, 40, 50,
            System.out.print( i+" ");

            if ( i == 30){ // if we put  if statement before  print statement, 30 will not include.
                break;
            }
        }
        System.out.println();
        System.out.println("=============================================");

        for ( int x = 1000; x >= 100; x -= 100){

            System.out.println( x +" "); // 1000, 900, 800, 700, 600 ,, will be executed

            if ( x == 500){
                break; // exits the loop  / burda kaliyor
            }

        }


    }
}
