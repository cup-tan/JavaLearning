package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Aslihan";
        String lastName = "Basak";

        int age = 12;
        String citizen1 = "USA";
        String citizen2 = " France"; // not possible both ,so apply OR LOGIC

        boolean eligibleAge = age >= 18;
                             // 12 >= 18 ===> false
        boolean usCitizen = citizen1 == "USA" || citizen2 == " USA";
       //                    "USA" == "USA"   || "france" == "USA"
                                // true       ||      false ==> true
        // BOTH OF THEM MUST BE TRUE

       boolean eligibleToVote = eligibleAge && usCitizen;
                   //            false &&  true ===> false

        System.out.println(eligibleToVote); // false
        String fullname = firstName + " " + lastName;
        System.out.println(fullname + " is eligible to vote for Trump: " + eligibleToVote);
//                          will be printed


    }
}
