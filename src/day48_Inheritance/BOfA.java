package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ramazan", "Alic");
        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(12345656);
        obj.setBalance(50);




        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();

        obj.withDraw(700);

        obj.withDraw(-200);

        obj.withDraw(0);

        obj.withDraw(300);
        obj.availableBalance();

        obj.deposit(100000);

        System.out.println(obj);
    }
}
