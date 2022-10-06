package day22_NestedLoop;
/*

 *
 **
 ***
 ****
 *****
 ******
 *******


 *******
 ******
 *****
 ****
 ***
 **
 *

 */
public class Nested_Loop4 {

    public static void main(String[] args) {
 // i : row  j:column
/*
 *
 **
 ***
 ****
 *****
 ******
 *******

 */


for ( int i = 1; i <= 7; i++ ){ //i: 7 6 5 4 3 2 1

    for (int j = 1; j <= i; j++){ // j: 7 6 5 4 3 2 1
         System.out.print("*");

    }
    System.out.println();


}
        System.out.println("======================================");

for (int i = 7; i >= 1; i--){       //i: 7 6 5 4 3 2 1
    for( int j = i ; j >= 1 ;j--){ // j: 7 6 5 4 3 2 1
        System.out.print("*");
    }
    System.out.println();
}


    }
}
