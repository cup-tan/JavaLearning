package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {
        // vote : must be usa citizen  and 18 older


        // && : and

        String firstName = "Aslihan";
        String lastname = "Daniel";
        int age = 19;
        String citizenShip = "USA";
        boolean eligiableToVote = age >= 18  && citizenShip == "USA" ;

       // true && false== false   only true true === false false for  && AND LOGICAL
        System.out.println(eligiableToVote);

        String fullName = firstName + " " + lastname +" is eligible to vote: " + eligiableToVote;
        System.out.println(fullName);
       // Aslihan Daniel is eligible to vote: true

        boolean r6 = !true && false ; //false
        System.out.println(r6);

        boolean r7 = !false && 9>8;
        //           true && true
        System.out.println(r7);

        System.out.println("==============");

        // || : or

        boolean r8 = true == !false || false == true;

        boolean r9 = !false == false || true== !false;

        boolean r10 = !false == false && true== !false; // false





    }
}
