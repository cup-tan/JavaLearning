package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount BesLen = new BankAccount();
        BankAccount Ahmet= new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Wagar = new BankAccount();

        BesLen.setAccountInfo("Checking", "Beslan", "340803598029384");
        Ahmet.setAccountInfo("Checking", "Ahmet", "8749574382394802");
        Viorel.setAccountInfo("Checking", "Viorel", "90485039485332");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "93840239404353");
        Wagar.setAccountInfo("Checking","Wagar", "84375937534590");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(BesLen,Ahmet,Viorel,Nurmamet,Wagar));
//                                     0       1    2        3       4

        for (BankAccount each : accounts){ // all of the abjects
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();


        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("*********************************************************");
        accounts.removeIf( each -> each.balance < 1000 );
        System.out.println(accounts.size());
      /*  for ( BankAccount each : accounts){
            each.getAccountInfo();

       */




    }
}
