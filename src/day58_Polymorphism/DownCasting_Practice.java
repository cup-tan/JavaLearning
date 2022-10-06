package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Huawei;
import day57_Polymorphism.PhoneTasks.Iphone;
import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("11", "6", 1000);
        Iphone iphone = (Iphone) phone1;
        iphone.faceTiming(78899900);

        System.out.println(phone1);
        System.out.println(iphone);

        // second way
        ((Iphone)phone1).faceTiming(234456);

        System.out.println("=====================================");
        Phone phone2 = new Samsung("S20","7",1000);

        ((Samsung)phone2).freezing();

       // ((Iphone) phone2).faceTiming(7687898); iphone & samsung are not inheriting each other

        System.out.println("=====================================");

        Phone phone3 = new Huawei("spy","6",10);

        ( (Huawei)phone3 ).stealInfo();

        ( (Iphone) phone3).faceTiming(1233111); // ClassCastException
       // huawei and iphone don't have IS A relation



    }
}
