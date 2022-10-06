package day19_ForLoop;
/*
  5. Write a program that will print out all letters in English alphabet in ascending order
// a~ z
    6. Write a program that will print out all letters in English alphabet in descending order
// z~ a
 */
public class Characters_A_Z {
// 5. Write a program that will print out all letters in English alphabet in ascending order
//// a~ z
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for ( int i = 97; i <= 122; i++){
            char ch = (char)i;
            System.out.print(ch +" ");
        }
// both of them are the same way

        System.out.println();

    //task06:
        // 6. Write a program that will print out all letters in English alphabet in descending order
        // z~ a


        for ( char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+ " ");
        }
        System.out.println();


        for (int i = 90; i >= 65; i--){

            System.out.print((char)i+" "); // gives number if we don't create char method
        }

        System.out.println();

        System.out.println("===========================================");

      /*  for (int i = 0; i < 65000; i++){
            System.out.print( (char)i +" ");
        }
*/






    }
}
